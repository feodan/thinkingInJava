package polymorphism.covariant_return_types;

public class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}
