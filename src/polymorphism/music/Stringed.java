package polymorphism.music;

public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjust Stringed");
    }
}
