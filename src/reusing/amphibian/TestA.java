package reusing.amphibian;

public class TestA {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.eat();
        frog.repro();
        frog.swim();
    }
}
