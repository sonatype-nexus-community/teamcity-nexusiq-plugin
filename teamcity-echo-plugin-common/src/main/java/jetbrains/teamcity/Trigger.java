
// Trigger.java

package jetbrains.teamcity;

public class Trigger {
    private PolicyID policyID;
    private PolicyName policyName;
    private long threatLevel;
    private String policyViolationID;
    private ComponentFact[] componentFacts;

    public PolicyID getPolicyID() { return policyID; }
    public void setPolicyID(PolicyID value) { this.policyID = value; }

    public PolicyName getPolicyName() { return policyName; }
    public void setPolicyName(PolicyName value) { this.policyName = value; }

    public long getThreatLevel() { return threatLevel; }
    public void setThreatLevel(long value) { this.threatLevel = value; }

    public String getPolicyViolationID() { return policyViolationID; }
    public void setPolicyViolationID(String value) { this.policyViolationID = value; }

    public ComponentFact[] getComponentFacts() { return componentFacts; }
    public void setComponentFacts(ComponentFact[] value) { this.componentFacts = value; }
}