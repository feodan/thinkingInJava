package polymorphism.polymorphism;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {refcount++;}

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Dispose " + this);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    protected void finalize() {
        if (refcount != 0)
            System.out.println("Error: object is not properly cleaned-up!");
    }
}
