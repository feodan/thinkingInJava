package polymorphism.rodent;

public class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println( "What human give");
    }

    @Override
    public void sleep() {
        System.out.println( "In cell");
    }

    @Override
    public void fuck() {
        System.out.println( "If luck");
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }
}
