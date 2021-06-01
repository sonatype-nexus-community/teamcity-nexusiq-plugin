

// ComponentIdentifier.java

package jetbrains.teamcity;

public class ComponentIdentifier {
    private Format format;
    private Coordinates coordinates;

    public Format getFormat() { return format; }
    public void setFormat(Format value) { this.format = value; }

    public Coordinates getCoordinates() { return coordinates; }
    public void setCoordinates(Coordinates value) { this.coordinates = value; }
}