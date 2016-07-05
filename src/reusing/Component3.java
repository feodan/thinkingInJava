package reusing;

public class Component3 {
    public Component3(String a) {
        System.out.println("Component3" + a);
    }
    void dispose() {
        System.out.println("Dispose Component3");
    }
}
