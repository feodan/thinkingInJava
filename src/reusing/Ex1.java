package reusing;

public class Ex1 {
    Second sec;

    public void recall() {
        if (sec == null) {
            sec = new Second();
        }
        sec.test(new Simple("asdasd"));
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.recall();
    }
}
