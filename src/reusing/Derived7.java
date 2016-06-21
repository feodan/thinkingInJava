package reusing;

public class Derived7 extends Base7 {
    public Derived7() {
        super(" 55");

    }

    public Derived7(String a) {
        super(a);
        System.out.println("derived7 " + a);
    }

    public static void main(String[] args) {
        new Derived7();
        new Derived7("aaa");
    }
}
