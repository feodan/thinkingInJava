package polymorphism.music;

public class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjust Wind");
    }
}
