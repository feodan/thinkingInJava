package reusing;

public class Component1 {
    public Component1(String a) {
        System.out.println("Component1" + a);
    }

    void dispose() {
        System.out.println("Dispose Component1");
    }
}
