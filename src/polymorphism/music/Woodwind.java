package polymorphism.music;

public class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    public String toString() {
        return "Woodwind";
    }
}
