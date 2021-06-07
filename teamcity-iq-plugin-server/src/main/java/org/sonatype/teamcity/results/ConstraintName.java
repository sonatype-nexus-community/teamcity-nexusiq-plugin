
// ConstraintName.java

package org.sonatype.teamcity.results;

import java.io.IOException;

public enum ConstraintName {
    CRITICAL_RISK_CVSS_SCORE, HIGH_RISK_CVSS_SCORE, MEDIUM_RISK_CVSS_SCORE, UNKNOWN_3_RD_PARTY_COMPONENT, UNKNOWN_MODIFICATION_TO_COMPONENT, VERSION_IS_OLD, VERSION_IS_UNPOPULAR;

    public String toValue() {
        switch (this) {
            case CRITICAL_RISK_CVSS_SCORE: return "Critical risk CVSS score";
            case HIGH_RISK_CVSS_SCORE: return "High risk CVSS score";
            case MEDIUM_RISK_CVSS_SCORE: return "Medium risk CVSS score";
            case UNKNOWN_3_RD_PARTY_COMPONENT: return "Unknown 3rd party component";
            case UNKNOWN_MODIFICATION_TO_COMPONENT: return "Unknown modification to component";
            case VERSION_IS_OLD: return "Version is old";
            case VERSION_IS_UNPOPULAR: return "Version is unpopular";
        }
        return null;
    }

    public static ConstraintName forValue(String value) throws IOException {
        if (value.equals("Critical risk CVSS score")) return CRITICAL_RISK_CVSS_SCORE;
        if (value.equals("High risk CVSS score")) return HIGH_RISK_CVSS_SCORE;
        if (value.equals("Medium risk CVSS score")) return MEDIUM_RISK_CVSS_SCORE;
        if (value.equals("Unknown 3rd party component")) return UNKNOWN_3_RD_PARTY_COMPONENT;
        if (value.equals("Unknown modification to component")) return UNKNOWN_MODIFICATION_TO_COMPONENT;
        if (value.equals("Version is old")) return VERSION_IS_OLD;
        if (value.equals("Version is unpopular")) return VERSION_IS_UNPOPULAR;
        throw new IOException("Cannot deserialize ConstraintName");
    }
}
