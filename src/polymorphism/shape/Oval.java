package polymorphism.shape;

public class Oval extends Shape {
    @Override
    public void draw() {
        System.out.println("Oval.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Oval.erase()");
    }

    @Override
    public void test3() {
        System.out.println("Oval.test3()");
    }
}
