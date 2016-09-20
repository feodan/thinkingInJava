package polymorphism.cycle;

public class Exercise17 {
    public static void main(String[] args) {
        Cycle[] c = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
                new Cycle()
        };

        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
        ((Bicycle)c[2]).balance();
        ((Bicycle)c[3]).balance();
    }
}
