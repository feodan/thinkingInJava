package polymorphism.polymorphism;

public class FastSandwich extends Sandwich implements FastFoo {
    @Override
    public void f() {
        System.out.println("Be careful");
    }

    public static void main(String[] args) {
        new FastSandwich().f();
    }
}
