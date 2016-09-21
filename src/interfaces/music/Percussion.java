package interfaces.music;

public class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion play " + n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }
}
