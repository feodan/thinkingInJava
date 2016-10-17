package interfaces.multipleInterfaces;

public class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly, CanClimb{
    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    @Override
    public void climb() {

    }
}
