
// Field.java

package org.sonatype.teamcity.results;

import java.io.IOException;

public enum Field {
    ARTIFACT, GROUP, NAME, VERSION;

    public String toValue() {
        switch (this) {
            case ARTIFACT: return "Artifact";
            case GROUP: return "Group";
            case NAME: return "Name";
            case VERSION: return "Version";
        }
        return null;
    }

    public static Field forValue(String value) throws IOException {
        if (value.equals("Artifact")) return ARTIFACT;
        if (value.equals("Group")) return GROUP;
        if (value.equals("Name")) return NAME;
        if (value.equals("Version")) return VERSION;
        throw new IOException("Cannot deserialize Field");
    }
}
