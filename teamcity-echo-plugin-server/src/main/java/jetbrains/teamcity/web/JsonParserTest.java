package jetbrains.teamcity.web;

import com.fasterxml.jackson.core.JsonProcessingException;

import jetbrains.teamcity.results.IQScanResult;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

class
JsonParserTest {

    @Test
    public void ShouldParseFile() throws JsonProcessingException {
        String filePath = "C:\\Cameron\\Docs\\projects\\maven\\team-city\\teamcity-echo-plugin\\results.json";
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Object> model = new HashMap<>() ;
        IQScanResult result =  JsonParser.ParseJson(content);

        Assertions.assertEquals( "petclinic", result.getApplicationID());
    }
}