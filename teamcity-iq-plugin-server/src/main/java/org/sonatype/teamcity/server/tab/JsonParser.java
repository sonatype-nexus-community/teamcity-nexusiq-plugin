package org.sonatype.teamcity.server.tab;

import org.sonatype.teamcity.results.IQScanResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
    public static ObjectMapper getObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return mapper;
    }
    public static IQScanResult ParseJson( String resultsText) throws JsonProcessingException {
        ObjectMapper mapper = getObjectMapper();
        return mapper.readValue(resultsText, IQScanResult.class);
    }
}
