# Sonatype Nexus Lifecycle/IQ plugin for TeamCity

This plugin implements a custom "Sonatype Scan" build step for [Nexus Lifecycle](https://www.sonatype.com/products/lifecycle).

## To install

1. Run the build: `mvn package`
2. copy `target/teamcity-iq-plugin.zip` into plugins folder of TeamCity
3. download [nexusiq cli JAR file](https://help.sonatype.com/iqserver/product-information/download-and-compatibility#DownloadandCompatibility-CLI) to the agent
4. add 'Sonatype Scan' step in your pipeline and fill in the form
5. run


## To contribute

The project makes use of [TeamCity SDK Maven plugin](https://github.com/JetBrains/teamcity-sdk-maven-plugin)

To build and run the plugin in the development mode:

1. Run `mvn clean package` to build the plugin
2. Run `mvn tc-sdk:start` to start TeamCity server with the plugin
