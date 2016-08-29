package polymorphism.polymorphism;

public class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }

    public static String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
