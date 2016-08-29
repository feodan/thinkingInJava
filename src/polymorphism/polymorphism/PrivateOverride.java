package polymorphism.polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("privat f()");
    }

    public static void main(String[] args) {
        PrivateOverride p = new Derived();
        p.f();
    }
}
