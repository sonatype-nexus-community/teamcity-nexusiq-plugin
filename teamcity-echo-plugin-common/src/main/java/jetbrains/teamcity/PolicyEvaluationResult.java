
// PolicyEvaluationResult.java

package jetbrains.teamcity;

public class PolicyEvaluationResult {
    private Alert[] alerts;
    private long affectedComponentCount;
    private long criticalComponentCount;
    private long severeComponentCount;
    private long moderateComponentCount;
    private long criticalPolicyViolationCount;
    private long severePolicyViolationCount;
    private long moderatePolicyViolationCount;
    private long grandfatheredPolicyViolationCount;
    private long totalComponentCount;

    public Alert[] getAlerts() { return alerts; }
    public void setAlerts(Alert[] value) { this.alerts = value; }

    public long getAffectedComponentCount() { return affectedComponentCount; }
    public void setAffectedComponentCount(long value) { this.affectedComponentCount = value; }

    public long getCriticalComponentCount() { return criticalComponentCount; }
    public void setCriticalComponentCount(long value) { this.criticalComponentCount = value; }

    public long getSevereComponentCount() { return severeComponentCount; }
    public void setSevereComponentCount(long value) { this.severeComponentCount = value; }

    public long getModerateComponentCount() { return moderateComponentCount; }
    public void setModerateComponentCount(long value) { this.moderateComponentCount = value; }

    public long getCriticalPolicyViolationCount() { return criticalPolicyViolationCount; }
    public void setCriticalPolicyViolationCount(long value) { this.criticalPolicyViolationCount = value; }

    public long getSeverePolicyViolationCount() { return severePolicyViolationCount; }
    public void setSeverePolicyViolationCount(long value) { this.severePolicyViolationCount = value; }

    public long getModeratePolicyViolationCount() { return moderatePolicyViolationCount; }
    public void setModeratePolicyViolationCount(long value) { this.moderatePolicyViolationCount = value; }

    public long getGrandfatheredPolicyViolationCount() { return grandfatheredPolicyViolationCount; }
    public void setGrandfatheredPolicyViolationCount(long value) { this.grandfatheredPolicyViolationCount = value; }

    public long getTotalComponentCount() { return totalComponentCount; }
    public void setTotalComponentCount(long value) { this.totalComponentCount = value; }
}
