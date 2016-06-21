package reusing.delegation;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation proector = new SpaceShipDelegation("BATON");
        proector.forward(250);
    }
}
