

// DisplayName.java

package org.sonatype.teamcity.results;

public class DisplayName {
    private Part[] parts;
    private String name;

    public Part[] getParts() { return parts; }
    public void setParts(Part[] value) { this.parts = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}