package polymorphism.cycle;

public class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()");
        wheels(1);
    }

    public void balance() {
        System.out.println("Unicycle balance");
    }
}
