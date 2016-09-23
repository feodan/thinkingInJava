package interfaces.music;

abstract class Instrument implements Playable{
    private int i;

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();

    @Override
    public void play(Note n) {
        System.out.println(this + " play " + n);
    }
}
