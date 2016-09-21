package interfaces.music;

public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind play() " + n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Wind";
    }
}
