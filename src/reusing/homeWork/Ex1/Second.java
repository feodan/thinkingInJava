package reusing.homeWork.Ex1;

public class Second {
    Simple my= new Simple("qweqw");

    public Simple test(String text) {
        if (my == null) {
            System.out.println("not init");
        } else {
            my = new Simple(text);
        }
        return my;
    }
}
