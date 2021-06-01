
// Extension.java

package jetbrains.teamcity;

import java.io.IOException;

public enum Extension {
    JAR;

    public String toValue() {
        switch (this) {
            case JAR: return "jar";
        }
        return null;
    }

    public static Extension forValue(String value) throws IOException {
        if (value.equals("jar")) return JAR;
        throw new IOException("Cannot deserialize Extension");
    }
}