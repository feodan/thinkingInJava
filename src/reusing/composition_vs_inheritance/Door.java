package reusing.composition_vs_inheritance;

public class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}
