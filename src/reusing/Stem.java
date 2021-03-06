package reusing;

public class Stem extends Root {
    Component1 component1 = new Component1("1");
    Component2 component2 = new Component2("2");
    Component3 component3 = new Component3("3");

    public Stem(String a) {
        super(a);
        System.out.println("strem " + a);
    }

    void dispose() {
        System.out.println("Dispose Stem");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        new Stem("stem").dispose();
    }
}
