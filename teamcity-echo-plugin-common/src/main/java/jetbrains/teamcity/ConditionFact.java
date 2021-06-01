
// ConditionFact.java

package jetbrains.teamcity;

public class ConditionFact {
    private ConditionTypeID conditionTypeID;
    private long conditionIndex;
    private String summary;
    private String reason;
    private Reference reference;
    private Object triggerJSON;

    public ConditionTypeID getConditionTypeID() { return conditionTypeID; }
    public void setConditionTypeID(ConditionTypeID value) { this.conditionTypeID = value; }

    public long getConditionIndex() { return conditionIndex; }
    public void setConditionIndex(long value) { this.conditionIndex = value; }

    public String getSummary() { return summary; }
    public void setSummary(String value) { this.summary = value; }

    public String getReason() { return reason; }
    public void setReason(String value) { this.reason = value; }

    public Reference getReference() { return reference; }
    public void setReference(Reference value) { this.reference = value; }

    public Object getTriggerJSON() { return triggerJSON; }
    public void setTriggerJSON(Object value) { this.triggerJSON = value; }
}