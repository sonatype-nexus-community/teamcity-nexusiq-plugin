
// PolicyName.java

package org.sonatype.teamcity.results;

import java.io.IOException;

public enum PolicyName {
    ARCHITECTURE_QUALITY, COMPONENT_SIMILAR, COMPONENT_UNKNOWN, SECURITY_CRITICAL, SECURITY_HIGH, SECURITY_MEDIUM;

    public String toValue() {
        switch (this) {
            case ARCHITECTURE_QUALITY: return "Architecture-Quality";
            case COMPONENT_SIMILAR: return "Component-Similar";
            case COMPONENT_UNKNOWN: return "Component-Unknown";
            case SECURITY_CRITICAL: return "Security-Critical";
            case SECURITY_HIGH: return "Security-High";
            case SECURITY_MEDIUM: return "Security-Medium";
        }
        return null;
    }

    public static PolicyName forValue(String value) throws IOException {
        if (value.equals("Architecture-Quality")) return ARCHITECTURE_QUALITY;
        if (value.equals("Component-Similar")) return COMPONENT_SIMILAR;
        if (value.equals("Component-Unknown")) return COMPONENT_UNKNOWN;
        if (value.equals("Security-Critical")) return SECURITY_CRITICAL;
        if (value.equals("Security-High")) return SECURITY_HIGH;
        if (value.equals("Security-Medium")) return SECURITY_MEDIUM;
        throw new IOException("Cannot deserialize PolicyName");
    }
}