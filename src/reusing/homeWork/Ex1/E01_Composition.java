package reusing.homeWork.Ex1;

public class E01_Composition {
    public static void main(String[] args) {
        Second1 second1 = new Second1("init second");
        second1.ckeck();
        System.out.println(second1.getSimple1());
        second1.ckeck();
        System.out.println(second1);
        second1.setSimple("NEW");
        System.out.println(second1);
    }
}
