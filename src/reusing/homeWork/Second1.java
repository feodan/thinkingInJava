package reusing.homeWork;

public class Second1 {
    Simple1 simple1;
    String s;

    public Second1(String s) {
        this.s = s;
    }

    public void ckeck() {
        if (simple1 == null) {
            System.out.println("not initialized");
        } else {
            System.out.println("initialized");
        }
    }

    private Simple1 lazy() {
        if (simple1 == null) {
            System.out.println("Create simple1");
            simple1 = new Simple1(s);
        }
        return simple1;
    }

    public Simple1 getSimple1() {
        return lazy();
    }

    @Override
    public String toString() {
        return lazy().toString();
    }

    public void setSimple(String newText) {
        lazy().setS(newText);
    }
}
