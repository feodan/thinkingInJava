package reusing;

public class Root {

    static {

    }

    public Root() {
        System.out.println("root");
    }

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
}
