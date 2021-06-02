
// ConstraintFact.java

package jetbrains.teamcity;

public class ConstraintFact {
    private String constraintID;
    private String constraintName;
    private String operatorName;
    private ConditionFact[] conditionFacts;

    public String getConstraintID() { return constraintID; }
    public void setConstraintID(String value) { this.constraintID = value; }

    public String getConstraintName() { return constraintName; }
    public void setConstraintName(String value) { this.constraintName = value; }

    public String getOperatorName() { return operatorName; }
    public void setOperatorName(String value) { this.operatorName = value; }

    public ConditionFact[] getConditionFacts() { return conditionFacts; }
    public void setConditionFacts(ConditionFact[] value) { this.conditionFacts = value; }
}
