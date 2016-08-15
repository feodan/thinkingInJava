package polymorphism.music;

public class Music2 {
//    public static void tune(Wind i) {
//        i.play(Note.MIDDLE_C);
//    }
//    public static void tune(Stringed i) {
//        i.play(Note.MIDDLE_C);
//    }
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
//        Wind flute = new Wind();
//        Stringed violin = new Stringed();
//        Brass frenchHorn = new Brass();
        tune(new Wind());
        tune(new Stringed());
        tune(new Brass());
    }
}
