package reusing.homeWork.Ex1;

public class Simple1 {
    String s;

    public Simple1(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
