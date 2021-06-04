
// Trigger.java

package jetbrains.teamcity.results;

public class Trigger {
    private String policyID;
    private String policyName;
    private long threatLevel;
    private String policyViolationID;
    private ComponentFact[] componentFacts;

    public String getPolicyID() { return policyID; }
    public void setPolicyID(String value) { this.policyID = value; }

    public String getPolicyName() { return policyName; }
    public void setPolicyName(String value) { this.policyName = value; }

    public long getThreatLevel() { return threatLevel; }
    public void setThreatLevel(long value) { this.threatLevel = value; }

    public String getPolicyViolationID() { return policyViolationID; }
    public void setPolicyViolationID(String value) { this.policyViolationID = value; }

    public ComponentFact[] getComponentFacts() { return componentFacts; }
    public void setComponentFacts(ComponentFact[] value) { this.componentFacts = value; }
}