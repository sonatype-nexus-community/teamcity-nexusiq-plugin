
// OperatorName.java

package org.sonatype.teamcity.results;

import java.io.IOException;

public enum OperatorName {
    AND, OR;

    public String toValue() {
        switch (this) {
            case AND: return "AND";
            case OR: return "OR";
        }
        return null;
    }

    public static OperatorName forValue(String value) throws IOException {
        if (value.equals("AND")) return AND;
        if (value.equals("OR")) return OR;
        throw new IOException("Cannot deserialize OperatorName");
    }
}