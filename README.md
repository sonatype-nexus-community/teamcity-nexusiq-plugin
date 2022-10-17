# Sonatype Nexus Lifecycle/IQ plugin for TeamCity

[![CircleCI](https://circleci.com/gh/sonatype-nexus-community/teamcity-nexusiq-plugin.svg?style=shield)](https://circleci.com/gh/sonatype-nexus-community/teamcity-nexusiq-plugin)

This plugin implements a custom "Sonatype Scan" build step for TeamCity so you can integrate TeamCity CI/CD builds 
direclty with your [Sonatype Nexus Lifecycle](https://www.sonatype.com/products/lifecycle) instance.

# Installation

1. Obtain the [latest release](https://github.com/sonatype-nexus-community/teamcity-nexusiq-plugin/releases) of this 
   plugin or [build from source](#building-from-source) locally
2. Install into TeamCity by either:
    1. Uploading the plugin zip to the Admin interface (Administrator -> Plugins -> Upload plugin zip)
    2. Placing the plugin zip into the plugins directory prior to starting TeamCity - typically this is
    `/data/teamcity_server/datadir/plugins`

Validate the plugin is installed successfully by checking it is listed under *Administration -> Plugins*:

![TeamCity plugin for Nexus Lifcycle installed](https://github.com/sonatype-nexus-community/teamcity-nexusiq-plugin/blob/feature/doc-updates/docs/teamcity-plugin-installed.png?raw=true)

You'll also need to bake the [Sonatype Nexus IQ CLI JAR](https://help.sonatype.com/iqserver/product-information/download-and-compatibility#DownloadandCompatibility-CLI) 
into one or more of your TeamCity agents. If your agent is a Docker Image, you could customise your docker image
similar to this example `Dockerfile`:
```
ARG TEAMCITY_VERSION=2021.1.2
FROM jetbrains/teamcity-agent:${TEAMCITY_VERSION}
RUN set -eux; \
    curl -L -f -o /services/nexus-iq-cli-latest.jar https://download.sonatype.com/clm/scanner/latest.jar;
```

This places the latest Nexus IQ CLI JAR at the path `/services/nexus-iq-cli-latest.jar`.

# Usage

You can now add the *Sonatype Scan" build step to your projects:
![Adding Sonatype Scan to a build](https://github.com/sonatype-nexus-community/teamcity-nexusiq-plugin/blob/feature/doc-updates/docs/teamcity-configure-build-step.png?raw=true)

Be sure to set the values appropriate to your environment:
- **IQCLI.jar path**: Example `/services/nexus-iq-cli-latest.jar` if you are following the `Dockerfile` example above
- **IQServer URL**: Full URL to your Nexus Lifecycle Server
- **Username** and **Password**: Authentication into your Nexus Lifecycle Server
- **ApplicationId**: The ID of the application in your Nexus Lifecycle Server
- **Stage**: Which stage of the SDLC this scan relates to - typically this will be **build**
- **Scan target**: Set this to `.` unless you have a more complex configuration

Once you've run your build and the _Sonatype Scan_ step has executed successfully, you'll see a new **Sonatype Report**
tab available on the build results page. This gives you the policy and violation overview from your scan as well as
a deep link to the full report in Nexus Lifecycle.
![Sonatype Report tab](https://github.com/sonatype-nexus-community/teamcity-nexusiq-plugin/blob/feature/doc-updates/docs/teamcity-sonatype-report.png?raw=true)

<a name="building-from-source"></a>
# Building from Source

Run:
```
mvn clean package
```

The resulting plugin is packaged and present in `target/teamcity-iq-plugin.zip`.

# Contributing

The project makes use of [TeamCity SDK Maven plugin](https://github.com/JetBrains/teamcity-sdk-maven-plugin)

To build and run the plugin in the development mode:

1. Run `mvn clean package` to build the plugin
2. Run `mvn tc-sdk:start` to start TeamCity server with the plugin

# License
See `LICENSE` file for details.


# The Fine Print
It is worth noting that this is NOT SUPPORTED by Sonatype, and is a contribution of ours to the open source community (read: you!)

Remember:

- Use this contribution at the risk tolerance that you have
- Do NOT file Sonatype support tickets related to this project
- DO file issues here on GitHub, so that the community can pitch in
- Phew, that was easier than I thought. Last but not least of all:

Have fun creating and using this utility to quickly get hands-on with Nexus Repository and Nexus Lifecycle. We are glad to have you here!