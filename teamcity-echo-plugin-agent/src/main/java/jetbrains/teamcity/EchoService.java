package jetbrains.teamcity;

import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.runner.BuildServiceAdapter;
import jetbrains.buildServer.agent.runner.ProgramCommandLine;
import jetbrains.buildServer.agent.runner.SimpleProgramCommandLine;
import jetbrains.buildServer.util.FileUtil;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EchoService extends BuildServiceAdapter {
  private final Set<File> myFilesToDelete = new HashSet<File>();

  @NotNull
  @Override
  public ProgramCommandLine makeProgramCommandLine() throws RunBuildException {

    final String jarFile = getRunnerParameters().get(EchoRunnerConstants.IQ_CLIJARFILE_KEY);
    final String iq_server = getRunnerParameters().get(EchoRunnerConstants.IQ_SERVER_KEY);
    final String username = getRunnerParameters().get(EchoRunnerConstants.IQ_USERNAME_KEY);
    final String password = getRunnerParameters().get(EchoRunnerConstants.IQ_PASSWORD_KEY);
    final String applicationid = getRunnerParameters().get(EchoRunnerConstants.IQ_APPLICATIONID_KEY);
    final String stage = getRunnerParameters().get(EchoRunnerConstants.IQ_STAGE_KEY);
    final String scantarget = getRunnerParameters().get(EchoRunnerConstants.IQ_SCANTARGET_KEY);

    final String scriptContent = String.format("java -jar %s -s %s -a %s:%s -i %s -r results.json -t %s %s", jarFile, iq_server, username, password, applicationid, stage, scantarget);

    final String script = getCustomScript(scriptContent);

    setExecutableAttribute(script);

    return new SimpleProgramCommandLine(getRunnerContext(), script, Collections.<String>emptyList());
    //return new SimpleProgramCommandLine(getRunnerContext(), "java", Arrays.asList("-jar", jarFile, "-s", iq_server, "-a", username + ':' + password, "-i", applicationid, "-r", "results.json", "-t", stage, scantarget));
  }

  String getCustomScript(String scriptContent) throws RunBuildException {
    try {
      final File scriptFile = File.createTempFile("custom_script", ".bat", getAgentTempDirectory());
      FileUtil.writeFileAndReportErrors(scriptFile, scriptContent);
      myFilesToDelete.add(scriptFile);
      return scriptFile.getAbsolutePath();
    } catch (IOException e) {
      RunBuildException exception = new RunBuildException("Failed to create temporary custom script file in directory '" + getAgentTempDirectory() + "': " + e
          .toString(), e);
      exception.setLogStacktrace(false);
      throw exception;
    }
  }

  private void setExecutableAttribute(@NotNull final String script) throws RunBuildException {
    try {
      return;
//      TCStreamUtil.setFileMode(new File(script), "a+x");
    } catch (Throwable t) {
      throw new RunBuildException("Failed to set executable attribute for custom script '" + script + "'", t);
    }
  }

  @Override
  public void afterProcessFinished() throws RunBuildException {
    super.afterProcessFinished();
    for (File file : myFilesToDelete) {
      FileUtil.delete(file);
    }
    myFilesToDelete.clear();
  }
}
