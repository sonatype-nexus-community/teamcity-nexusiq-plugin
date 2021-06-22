package org.sonatype.teamcity.agent;

import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.BuildProgressLogger;
import jetbrains.buildServer.agent.runner.BuildServiceAdapter;
import jetbrains.buildServer.agent.runner.ProgramCommandLine;

import org.jetbrains.annotations.NotNull;
import org.sonatype.teamcity.common.IQRunnerConstants;

import java.util.Arrays;

public class IQService extends BuildServiceAdapter {
  String results;

  @NotNull
  @Override
  public ProgramCommandLine makeProgramCommandLine() throws RunBuildException {

    final String jarFile = getRunnerParameters().get(IQRunnerConstants.IQ_CLIJARFILE_KEY);
    final String iq_server = getRunnerParameters().get(IQRunnerConstants.IQ_SERVER_KEY);
    final String username = getRunnerParameters().get(IQRunnerConstants.IQ_USERNAME_KEY);
    final String password = getRunnerParameters().get(IQRunnerConstants.IQ_PASSWORD_KEY);
    final String applicationid = getRunnerParameters().get(IQRunnerConstants.IQ_APPLICATIONID_KEY);
    final String stage = getRunnerParameters().get(IQRunnerConstants.IQ_STAGE_KEY);
    final String scantarget = getRunnerParameters().get(IQRunnerConstants.IQ_SCANTARGET_KEY);

    results = "results-" + stage + ".json";

    return createProgramCommandline("java", Arrays.asList("-jar", jarFile, "-s", iq_server, "-a", username + ':' + password, "-i", applicationid, "-r", results, "-t", stage, scantarget));
  }

  @Override
  public void afterProcessFinished() throws RunBuildException {
    BuildProgressLogger buildLogger = getLogger();

    // automatically publish scan result
    buildLogger.message("##teamcity[publishArtifacts '" + results + "']");

    super.afterProcessFinished();
  }
}
