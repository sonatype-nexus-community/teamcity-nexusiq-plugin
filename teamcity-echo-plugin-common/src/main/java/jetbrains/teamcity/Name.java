

// Name.java

package jetbrains.teamcity;

import java.io.IOException;

public enum Name {
    BOOTSTRAP, JQUERY, ORG_WEBJARS_BOOTSTRAP;

    public String toValue() {
        switch (this) {
            case BOOTSTRAP: return "bootstrap";
            case JQUERY: return "jquery";
            case ORG_WEBJARS_BOOTSTRAP: return "org.webjars bootstrap";
        }
        return null;
    }

    public static Name forValue(String value) throws IOException {
        if (value.equals("bootstrap")) return BOOTSTRAP;
        if (value.equals("jquery")) return JQUERY;
        if (value.equals("org.webjars bootstrap")) return ORG_WEBJARS_BOOTSTRAP;
        throw new IOException("Cannot deserialize Name");
    }
}
