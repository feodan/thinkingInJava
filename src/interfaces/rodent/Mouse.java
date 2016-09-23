package interfaces.rodent;

public class Mouse implements Rodent {
    String str = "Mouse member object " + Rodent.str;

    public Mouse() {
        System.out.println("Mouse constructor");
    }

    @Override
    public void eat() {
        System.out.println("What find");
    }

    @Override
    public void sleep() {
        System.out.println("In burrow");
    }

    @Override
    public void fuck() {
        System.out.println("As much as possible");
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }
}
