

// ComponentIdentifier.java

package org.sonatype.teamcity.results;

public class ComponentIdentifier {
    private String format;
    private Coordinates coordinates;

    public String getFormat() { return format; }
    public void setFormat(String value) { this.format = value; }

    public Coordinates getCoordinates() { return coordinates; }
    public void setCoordinates(Coordinates value) { this.coordinates = value; }
}