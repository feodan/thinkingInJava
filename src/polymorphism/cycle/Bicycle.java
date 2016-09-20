package polymorphism.cycle;

public class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()");
        wheels(2);
    }

    public void balance() {
        System.out.println("Bicycle balance");
    }
}
