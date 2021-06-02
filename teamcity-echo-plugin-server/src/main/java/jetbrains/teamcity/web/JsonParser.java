package jetbrains.teamcity.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jetbrains.teamcity.IQScanResult;

public class JsonParser {
    public static ObjectMapper getObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        return mapper;
    }
    public static IQScanResult ParseJson( String resultsText) throws JsonProcessingException {
        ObjectMapper mapper = getObjectMapper();
        return mapper.readValue(resultsText, IQScanResult.class);
    }
}
