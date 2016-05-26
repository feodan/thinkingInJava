package reusing;

public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("reusing.WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
