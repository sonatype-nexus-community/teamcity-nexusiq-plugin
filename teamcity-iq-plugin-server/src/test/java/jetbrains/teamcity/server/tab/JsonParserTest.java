package jetbrains.teamcity.server.tab;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sonatype.teamcity.results.IQScanResult;
import org.sonatype.teamcity.server.tab.JsonParser;

import java.io.IOException;
import java.io.InputStream;

class
JsonParserTest {

    @Test
    public void ShouldParseFile() throws IOException {
        String content = "";
        try(InputStream in = this.getClass().getResourceAsStream("/results.json"))
        {
          content = IOUtils.toString(in, "UTF-8");
        }

        IQScanResult result =  JsonParser.ParseJson(content);

        Assertions.assertEquals( "petclinic", result.getApplicationID());
    }
}