package interfaces.music;

public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind play " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
