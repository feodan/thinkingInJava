package interfaces.music5;

import polymorphism.music.Note;

abstract class AbstractForMusic {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()"); }

    public abstract String toString();
}
