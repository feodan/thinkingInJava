package reusing.wind;

public class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}
