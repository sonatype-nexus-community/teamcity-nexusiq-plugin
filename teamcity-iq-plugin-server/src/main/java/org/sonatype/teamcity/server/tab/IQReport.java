package org.sonatype.teamcity.server.tab;


import com.intellij.openapi.util.io.StreamUtil;
import jetbrains.buildServer.serverSide.BuildsManager;
import jetbrains.buildServer.serverSide.SBuild;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifactHolder;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifacts;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifactsViewMode;
import jetbrains.buildServer.web.openapi.BuildTab;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;

import org.jetbrains.annotations.NotNull;
import org.sonatype.teamcity.results.IQScanResult;

import java.io.IOException;
import java.util.Map;

public class IQReport extends BuildTab {

  protected IQReport(WebControllerManager manager, BuildsManager buildManager, PluginDescriptor descriptor) {
    super("iqReportTab", "Sonatype Report", manager, buildManager,
    descriptor.getPluginResourcesPath("iqReport.jsp"));
  }

  @Override
  protected void fillModel(@NotNull Map<String, Object> model, @NotNull SBuild build) {


    final BuildArtifacts buildArtifacts = build.getArtifacts(BuildArtifactsViewMode.VIEW_DEFAULT);
    final BuildArtifactHolder artifact = buildArtifacts.findArtifact("results.json");
    if (artifact.isAvailable()) {
      try {
        final String resultsText = StreamUtil.readText(artifact.getArtifact().getInputStream());
        IQScanResult result = JsonParser.ParseJson(resultsText);
        model.put("text", resultsText);
        model.put("affectedComponentCount", result.getPolicyEvaluationResult().getAffectedComponentCount());
        model.put("reportHTMLURL", result.getReportHTMLURL());
        model.put("applicationId", result.getApplicationID());
//TODO; Work out how to get server params        final String stage = getRunnerParameters().get(EchoRunnerConstants.IQ_STAGE_KEY);
        model.put("stage", "release"); //         -getParameters
        model.put("criticalComponentCount", result.getPolicyEvaluationResult().getCriticalComponentCount());
        model.put("severeComponentCount", result.getPolicyEvaluationResult().getSevereComponentCount());
        model.put("moderateComponentCount", result.getPolicyEvaluationResult().getModerateComponentCount());
        model.put("criticalPolicyViolationCount", result.getPolicyEvaluationResult().getCriticalPolicyViolationCount());
        model.put("severePolicyViolationCount", result.getPolicyEvaluationResult().getSeverePolicyViolationCount());
        model.put("moderatePolicyViolationCount", result.getPolicyEvaluationResult().getModeratePolicyViolationCount());
        model.put("grandfatheredPolicyViolationCount", result.getPolicyEvaluationResult().getGrandfatheredPolicyViolationCount());
        model.put("totalComponentCount", result.getPolicyEvaluationResult().getTotalComponentCount());
        model.put("totalViolationCount",result.getPolicyEvaluationResult().getCriticalPolicyViolationCount()+result.getPolicyEvaluationResult().getSeverePolicyViolationCount()+result.getPolicyEvaluationResult().getModeratePolicyViolationCount());

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
