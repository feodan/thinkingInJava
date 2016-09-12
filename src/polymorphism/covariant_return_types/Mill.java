package polymorphism.covariant_return_types;

public class Mill {
    Grain process() {
        return new Grain();
    }
}
