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
import org.sonatype.teamcity.results.PolicyEvaluationResult;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class IQReport extends BuildTab {

  protected IQReport(WebControllerManager manager, BuildsManager buildManager, PluginDescriptor descriptor) {
    super("iqReportTab", "Sonatype Report", manager, buildManager,
    descriptor.getPluginResourcesPath("iqReport.jsp"));
  }

  @Override
  protected void fillModel(@NotNull Map<String, Object> model, @NotNull SBuild build) {
    final BuildArtifacts buildArtifacts = build.getArtifacts(BuildArtifactsViewMode.VIEW_DEFAULT);

    // find results-<stage>.json artifact
    final AtomicReference<String> locatedArtifactPath = new AtomicReference<String>(null);
    build.getArtifacts(BuildArtifactsViewMode.VIEW_ALL_WITH_ARCHIVES_CONTENT).iterateArtifacts(artifact -> {
      if(artifact.getName().matches("^results-.+.json$")){
        locatedArtifactPath.set(artifact.getName());
        return BuildArtifacts.BuildArtifactsProcessor.Continuation.BREAK;
      }
      else return BuildArtifacts.BuildArtifactsProcessor.Continuation.CONTINUE;
    });

    String artifactPath = locatedArtifactPath.get();
    if (artifactPath == null) {
      return;
    }
    String stage = artifactPath.substring("results-".length(), artifactPath.length()-".json".length());

    final BuildArtifactHolder artifact = buildArtifacts.findArtifact(artifactPath);
    if (!artifact.isAvailable()) {
      return;
    }

    IQScanResult result = null;
    try {
      final String resultsText = StreamUtil.readText(artifact.getArtifact().getInputStream());
      result = JsonParser.ParseJson(resultsText);
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    PolicyEvaluationResult per = result.getPolicyEvaluationResult();
    model.put("affectedComponentCount", per.getAffectedComponentCount());
    model.put("reportHTMLURL", result.getReportHTMLURL());
    model.put("applicationId", result.getApplicationID());
    model.put("stage", stage);
    model.put("criticalComponentCount", per.getCriticalComponentCount());
    model.put("severeComponentCount", per.getSevereComponentCount());
    model.put("moderateComponentCount", per.getModerateComponentCount());
    model.put("criticalPolicyViolationCount", per.getCriticalPolicyViolationCount());
    model.put("severePolicyViolationCount", per.getSeverePolicyViolationCount());
    model.put("moderatePolicyViolationCount", per.getModeratePolicyViolationCount());
    model.put("grandfatheredPolicyViolationCount", per.getGrandfatheredPolicyViolationCount());
    model.put("totalComponentCount", per.getTotalComponentCount());
    model.put("totalViolationCount", per.getCriticalPolicyViolationCount() + per.getSeverePolicyViolationCount() + per.getModeratePolicyViolationCount());

  }
}
