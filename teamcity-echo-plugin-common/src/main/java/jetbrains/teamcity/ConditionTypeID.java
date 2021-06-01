

// ConditionTypeID.java

package jetbrains.teamcity;

import java.io.IOException;

public enum ConditionTypeID {
    AGE_IN_DAYS, COORDINATES, DATA_SOURCE, MATCH_STATE, PROPRIETARY, RELATIVE_POPULARITY, SECURITY_VULNERABILITY_SEVERITY;

    public String toValue() {
        switch (this) {
            case AGE_IN_DAYS: return "AgeInDays";
            case COORDINATES: return "Coordinates";
            case DATA_SOURCE: return "DataSource";
            case MATCH_STATE: return "MatchState";
            case PROPRIETARY: return "Proprietary";
            case RELATIVE_POPULARITY: return "RelativePopularity";
            case SECURITY_VULNERABILITY_SEVERITY: return "SecurityVulnerabilitySeverity";
        }
        return null;
    }

    public static ConditionTypeID forValue(String value) throws IOException {
        if (value.equals("AgeInDays")) return AGE_IN_DAYS;
        if (value.equals("Coordinates")) return COORDINATES;
        if (value.equals("DataSource")) return DATA_SOURCE;
        if (value.equals("MatchState")) return MATCH_STATE;
        if (value.equals("Proprietary")) return PROPRIETARY;
        if (value.equals("RelativePopularity")) return RELATIVE_POPULARITY;
        if (value.equals("SecurityVulnerabilitySeverity")) return SECURITY_VULNERABILITY_SEVERITY;
        throw new IOException("Cannot deserialize ConditionTypeID");
    }
}