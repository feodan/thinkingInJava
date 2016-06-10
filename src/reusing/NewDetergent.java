package reusing;

public class NewDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" NewDetergent() scrub");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}
