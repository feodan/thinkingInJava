package polymorphism.starship;

public class StageStarship {
    private Alert alert = new ReadySystemAlert();

    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public String toString() {
        return alert.display();
    }
}
