package interfaces.music5;

import polymorphism.music.Note;

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + "adjust");
    }

    @Override
    public String toString() {
        return "Stringed";
    }

}
