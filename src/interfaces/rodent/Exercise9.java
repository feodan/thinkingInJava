package interfaces.rodent;

public class Exercise9 {
    public static void main(String[] args) {
        Rodent[] rodent = {
                new Gerbil(),
                new Hamster(),
                new Mouse()
        };
        for (Rodent r : rodent) {
            System.out.println(r);
            r.eat();
            r.sleep();
            r.fuck();
        }
    }
}
