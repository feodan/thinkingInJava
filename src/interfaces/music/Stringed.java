package interfaces.music;

public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed play " + n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Stringed";
    }
}
