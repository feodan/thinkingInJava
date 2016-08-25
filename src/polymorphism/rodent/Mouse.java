package polymorphism.rodent;

public class Mouse extends Rodent {
    @Override
    public void eat() {
        System.out.println( "What find");
    }

    @Override
    public void sleep() {
        System.out.println( "In burrow");
    }

    @Override
    public void fuck() {
        System.out.println( "As much as possible");
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }
}
