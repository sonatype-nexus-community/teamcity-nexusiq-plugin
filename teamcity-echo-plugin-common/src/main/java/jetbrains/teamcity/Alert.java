
// Alert.java

package jetbrains.teamcity;

public class Alert {
    private Trigger trigger;
    private Object[] actions;

    public Trigger getTrigger() { return trigger; }
    public void setTrigger(Trigger value) { this.trigger = value; }

    public Object[] getActions() { return actions; }
    public void setActions(Object[] value) { this.actions = value; }
}