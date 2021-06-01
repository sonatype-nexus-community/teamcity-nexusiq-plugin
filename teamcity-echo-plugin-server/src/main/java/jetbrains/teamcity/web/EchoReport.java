package jetbrains.teamcity.web;

import com.google.gson.Gson;
import com.intellij.openapi.util.io.StreamUtil;
import jetbrains.buildServer.serverSide.BuildsManager;
import jetbrains.buildServer.serverSide.SBuild;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifactHolder;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifacts;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifactsViewMode;
import jetbrains.buildServer.web.openapi.BuildTab;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import jetbrains.teamcity.IQScanResult;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Map;



public class EchoReport extends BuildTab {
  protected EchoReport(WebControllerManager manager, BuildsManager buildManager, PluginDescriptor descriptor) {
    super("echoReportTab", "Sonatype Report", manager, buildManager,
    descriptor.getPluginResourcesPath("echoReport.jsp"));
  }

  @Override
  protected void fillModel(@NotNull Map<String, Object> model, @NotNull SBuild build) {

    final BuildArtifacts buildArtifacts = build.getArtifacts(BuildArtifactsViewMode.VIEW_DEFAULT);
    final BuildArtifactHolder artifact = buildArtifacts.findArtifact("results.json");
    if (artifact.isAvailable()) {
      try {
//        Reader reader = Files.newBufferedReader(artifact.getArtifact().);
        final String resultsText = StreamUtil.readText(artifact.getArtifact().getInputStream());
        Gson gson = new Gson();
        IQScanResult result = gson.fromJson(resultsText, IQScanResult.class);
        System.out.println(result.getScanID());
        model.put("text", resultsText);
        model.put("componentCount", result.getPolicyEvaluationResult().getAffectedComponentCount());
        model.put("iqserverreport", result.getReportHTMLURL());
        model.put("applicationid", result.getApplicationID());
        model.put("test", "cameron");

        //now parse the text file
        //*********************************************************************************************
        //Policy Action: None
        //Stage: build
        //[INFO] Number of components affected: 4 critical, 6 severe, 1 moderate
        // [INFO] Number of open policy violations: 4 critical, 26 severe, 1 moderate
        // [INFO] Number of grandfathered policy violations: 0
        // [INFO] Number of components: 79
        // [INFO] The detailed report can be viewed online at http://iq-server:8070/ui/links/application/petclinic/report/41554b35d0964c1c8926d73e5cd8092a
        // [INFO] *********************************************************************************************

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
