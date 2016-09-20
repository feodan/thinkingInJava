package polymorphism.rodent;

public class Rodent2 {
    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;

    Member m1 = new Member("r1"), m2 = new Member("r2");

    public Rodent2() {
        System.out.println("Creating " + this);
        System.out.println("Rodent constructor");
    }

    public void addRef() { refcount++; }

    @Override
    public String toString() {
        return "Rodent2{}" + id;
    }
}
