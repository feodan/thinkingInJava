package polymorphism.rodent;

public class Hamster2 extends Rodent2{
    private Rodent2 rodent2;
    private static int counter = 0;
    private int id = counter++;
    Member m1 = new Member("h1"), m2 = new Member("h2");

    public Hamster2() {
        System.out.println("Hamster constructor");
        this.rodent2 = rodent2;
        this.rodent2.addRef();
    }

    @Override
    public String toString() {
        return "Hamster2{}" + id;
    }
}
