package reusing;

public class Bath {
    // Initializing at point of definition:
    private String s1 = "Happy";
    private String s2 = "Happy";
    private String s3;
    private String s4;

    private Soap castille;
    private int i;
    private float toy;

    // Initializing in the constructor for that class:
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    // Instance initialization:
    {
        i = 47;
    }

    @Override
    public String toString() {
        // Delayed initialization:
        if (s4 == null) {
            s4 = "Joy";
        }
        return
                "s1='" + s1 + '\'' +
                        ", s2='" + s2 + '\'' +
                        ", s3='" + s3 + '\'' +
                        ", s4='" + s4 + '\'' +
                        ", castille=" + castille +
                        ", i=" + i +
                        ", toy=" + toy
                ;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}
