package interfaces.homeWork;

public class E04 {
    public static void test1(NoMethods nm) {
        ((Extended1)nm).f();
    }

    public static void test2(WithMethods wm) {
        wm.f();
    }
    public static void main(String[] args) {
        test1(new Extended1());
        test2(new Extended2());
    }
}
