package reusing;

public class Stem extends Root {
    public Stem() {
        System.out.println("strem");
    }

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public static void main(String[] args) {
        new Stem();
    }
}
