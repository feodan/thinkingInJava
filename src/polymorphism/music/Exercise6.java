package polymorphism.music;

public class Exercise6 {

    public static String what(Instrument i) {
        return i.what();
    }

    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };

    public static void main(String[] args) {
//        System.out.println(what(new Percussion()));
//        System.out.println(what(new Wind()));

        for (Instrument i : orchestra)
            System.out.println(i);
    }
}
