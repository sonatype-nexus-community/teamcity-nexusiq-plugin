

// Type.java

package jetbrains.teamcity.results;

import java.io.IOException;

public enum Type {
    SECURITY_VULNERABILITY_REFID;

    public String toValue() {
        switch (this) {
            case SECURITY_VULNERABILITY_REFID: return "SECURITY_VULNERABILITY_REFID";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("SECURITY_VULNERABILITY_REFID")) return SECURITY_VULNERABILITY_REFID;
        throw new IOException("Cannot deserialize Type");
    }
}
