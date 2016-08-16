package polymorphism.cycle;

public class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()");
        wheels(3);
    }
}
