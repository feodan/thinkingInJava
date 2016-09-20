package polymorphism.polymorphism;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
}
