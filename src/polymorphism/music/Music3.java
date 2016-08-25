package polymorphism.music;

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] i) {
        for (Instrument inst : i)
            tune(inst);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Gitar()
        };

        tuneAll(orchestra);

        for (Instrument i : orchestra)
            i.adjust();
    }
}
