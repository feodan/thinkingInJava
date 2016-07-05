package reusing;

public class Root {
    Component1 component1 = new Component1("1");
    Component2 component2 = new Component2("2");
    Component3 component3 = new Component3("3");

    public Root(String a) {
        System.out.println("root " + a);
    }

    void dispose() {
        System.out.println("Dispose Root");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}
