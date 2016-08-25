package polymorphism.music;

public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjust Percussion");
    }
}
