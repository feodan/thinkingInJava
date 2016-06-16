package reusing;

public class Derived1 extends Base1 {
    public Derived1() {
        super();
        System.out.println("argument");
    }

    public Derived1(String a) {
        super();
        System.out.println("no argument" + a);
    }

    public static void main(String[] args) {
        new Derived1("nnn");
        new Derived1();
    }
}
