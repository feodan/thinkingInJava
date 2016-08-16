package polymorphism.cycle;

public class Road {
    public static void way(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        way(u);
        way(b);
        way(t);
        way(new Cycle());

    }
}
