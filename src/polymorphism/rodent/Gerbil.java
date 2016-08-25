package polymorphism.rodent;

public class Gerbil extends Rodent {
    @Override
    public void eat() {
        System.out.println( "Food in desert");
    }

    @Override
    public void sleep() {
        System.out.println( "In sand burrow");
    }

    @Override
    public void fuck() {
        System.out.println( "Season with water");
    }

    @Override
    public String toString() {
        return "Gerbil{}";
    }
}
