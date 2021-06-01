
// ConstraintFact.java

package jetbrains.teamcity;

public class ConstraintFact {
    private ConstraintID constraintID;
    private ConstraintName constraintName;
    private OperatorName operatorName;
    private ConditionFact[] conditionFacts;

    public ConstraintID getConstraintID() { return constraintID; }
    public void setConstraintID(ConstraintID value) { this.constraintID = value; }

    public ConstraintName getConstraintName() { return constraintName; }
    public void setConstraintName(ConstraintName value) { this.constraintName = value; }

    public OperatorName getOperatorName() { return operatorName; }
    public void setOperatorName(OperatorName value) { this.operatorName = value; }

    public ConditionFact[] getConditionFacts() { return conditionFacts; }
    public void setConditionFacts(ConditionFact[] value) { this.conditionFacts = value; }
}
