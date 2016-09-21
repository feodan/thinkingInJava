package interfaces.music;

public class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass play " + n);
    }

    @Override
    public void adjust() {
        System.out.println("Brass adjust");
    }
}
