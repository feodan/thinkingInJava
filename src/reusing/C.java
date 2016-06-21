package reusing;

public class C extends A {

    public C(int i) {
        super(i);
        B b = new B(i);
    }

}
