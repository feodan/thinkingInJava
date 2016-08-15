package polymorphism.cycle;

public class Road {
    public static void way(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
//        Unicycle u = new Unicycle();
        way(new Unicycle());
        Bicycle b = new Bicycle();
        way(b);
        Tricycle t = new Tricycle();
        way(t);
        way(new Cycle());
    }
}
