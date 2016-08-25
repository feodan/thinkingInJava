package polymorphism.music;

public class Gitar extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Gitar.play()" + n);
    }

    @Override
    public String toString() {
        return "Gitar";
    }

    @Override
    void adjust() {
        System.out.println("Gitar.adjust()");
    }
}
