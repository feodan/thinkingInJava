package polymorphism.rodent;

public class Rodent {
    public void eat() {
        System.out.println("rodent eat");
    }

    public void sleep() {
        System.out.println("rodent sleep");
    }

    public void fuck() {
        System.out.println("rodent fuck");
    }

    @Override
    public String toString() {
        return "Rodent{}";
    }
}
