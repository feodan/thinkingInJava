package reusing.Orc;

public class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I’m a Villain and my name is " + name;
    }
}
