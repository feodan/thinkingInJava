package reusing.cleanup;

public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    void dispose() {
        System.out.println("Erasing circle");
        super.dispose();
    }
}
