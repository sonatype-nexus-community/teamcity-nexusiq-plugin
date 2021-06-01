
// Format.java

package jetbrains.teamcity;

import java.io.IOException;

public enum Format {
    A_NAME, MAVEN;

    public String toValue() {
        switch (this) {
            case A_NAME: return "a-name";
            case MAVEN: return "maven";
        }
        return null;
    }

    public static Format forValue(String value) throws IOException {
        if (value.equals("a-name")) return A_NAME;
        if (value.equals("maven")) return MAVEN;
        throw new IOException("Cannot deserialize Format");
    }
}
