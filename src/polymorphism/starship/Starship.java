package polymorphism.starship;

public class Starship {
    public static void main(String[] args) {
        StageStarship starship = new StageStarship();
        System.out.println(starship);
        starship.setAlert(new StarshipIsInFly());
        System.out.println(starship);
        starship.setAlert(new StarshipArrivedToDestinationAlert());
        System.out.println(starship);
    }
}
