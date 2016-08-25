package polymorphism.music;

import java.util.Random;

public class RandInstr {
    Random random = new Random();

    public Instrument randInst() {
        switch (random.nextInt(6)){
            default:
            case 0: return new Woodwind();
            case 1: return new Percussion();
            case 2: return new Gitar();
            case 3: return new Brass();
            case 4: return new Stringed();
            case 5: return new Wind();
        }
    }
}
