package polymorphism.music;

import polymorphism.shape.*;

public class Ex4 {
    public static void main(String[] args) {
        Shape[] s = {new Circle(), new Square(), new Triangle(), new Oval()};

        for (Shape a : s) {
            a.draw();
            a.erase();
            a.test3();
        }
    }
}
