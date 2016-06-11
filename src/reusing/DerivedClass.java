package reusing;

public class DerivedClass extends BaseClass {
    public DerivedClass() {
        super();
        System.out.println("Deriv");
    }

    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
//        System.out.println(d);
    }
}
