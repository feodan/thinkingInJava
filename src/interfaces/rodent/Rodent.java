package interfaces.rodent;

abstract class Rodent {
    static String str = "Rodent member object";

    public abstract void eat();

    public abstract void sleep();

    public abstract void fuck();

    @Override
    public String toString() {
        return "Rodent{}";
    }
}
