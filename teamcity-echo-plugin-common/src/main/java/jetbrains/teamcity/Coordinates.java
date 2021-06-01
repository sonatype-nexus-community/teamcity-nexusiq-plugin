

// Coordinates.java

package jetbrains.teamcity;

public class Coordinates {
    private String artifactID;
    private String classifier;
    private Extension extension;
    private String groupID;
    private String version;
    private Name name;
    private String qualifier;

    public String getArtifactID() { return artifactID; }
    public void setArtifactID(String value) { this.artifactID = value; }

    public String getClassifier() { return classifier; }
    public void setClassifier(String value) { this.classifier = value; }

    public Extension getExtension() { return extension; }
    public void setExtension(Extension value) { this.extension = value; }

    public String getGroupID() { return groupID; }
    public void setGroupID(String value) { this.groupID = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public Name getName() { return name; }
    public void setName(Name value) { this.name = value; }

    public String getQualifier() { return qualifier; }
    public void setQualifier(String value) { this.qualifier = value; }
}
