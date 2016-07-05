package reusing;

public class Component2 {
    public Component2(String a) {
        System.out.println("Component2" + a);
    }
    void dispose() {
        System.out.println("Dispose Component2");
    }
}
