// ComponentFact.java

package jetbrains.teamcity;

public class ComponentFact {
    private ComponentIdentifier componentIdentifier;
    private String hash;
    private ConstraintFact[] constraintFacts;
    private Object[] pathnames;
    private DisplayName displayName;

    public ComponentIdentifier getComponentIdentifier() { return componentIdentifier; }
    public void setComponentIdentifier(ComponentIdentifier value) { this.componentIdentifier = value; }

    public String getHash() { return hash; }
    public void setHash(String value) { this.hash = value; }

    public ConstraintFact[] getConstraintFacts() { return constraintFacts; }
    public void setConstraintFacts(ConstraintFact[] value) { this.constraintFacts = value; }

    public Object[] getPathnames() { return pathnames; }
    public void setPathnames(Object[] value) { this.pathnames = value; }

    public DisplayName getDisplayName() { return displayName; }
    public void setDisplayName(DisplayName value) { this.displayName = value; }
}