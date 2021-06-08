# Sonatype Nexus Lifecycle/IQ plugin for TeamCity

The plugin implements a custom "Sonatype Scan" build step for [Nexus Lifecycle](https://www.sonatype.com/products/lifecycle).

The project makes use of [TeamCity SDK Maven plugin](https://github.com/JetBrains/teamcity-sdk-maven-plugin)

To build and run the plugin in the development mode:

1. Run `mvn clean package` to build the plugin
2. Run `mvn tc-sdk:start` to start TeamCity server with the plugin
