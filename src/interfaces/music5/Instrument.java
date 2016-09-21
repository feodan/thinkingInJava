package interfaces.music5;

import polymorphism.music.Note;

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}
