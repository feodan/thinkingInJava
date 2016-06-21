package reusing;

public class DetergentDelegation {

    private Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        DetergentDelegation delegation = new DetergentDelegation();
        delegation.dilute();
        delegation.apply();
        delegation.scrub();
        delegation.foam();
        System.out.println(delegation);
        System.out.println("Base class:");
        Cleanser.main(args);
    }
}
