package reusing;

public class Detergent extends Cleanser {
    private Cleanser cleanser = new Cleanser();

    public void foam() {
        append(" foam()");
    }

    @Override
    public void append(String a) {
        cleanser.append(a);
    }

    @Override
    public void dilute() {
        cleanser.dilute();
    }

    @Override
    public void apply() {
        cleanser.apply();
    }

    @Override
    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
