package reusing;

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return
                "valve1='" + valve1 + '\'' +
                        ", valve2='" + valve2 + '\'' +
                        ", valve3='" + valve3 + '\'' +
                        ", valve4='" + valve4 + '\'' +
                        ", source=" + source +
                        ", i=" + i +
                        ", f=" + f +
                        '}';
    }

    public static void main(String[] args) {
        SprinklerSystem system = new SprinklerSystem();
        System.out.println(system);
    }

}
