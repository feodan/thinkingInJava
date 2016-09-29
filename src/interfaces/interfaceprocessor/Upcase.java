package interfaces.interfaceprocessor;

public class Upcase extends StringProcessor{
    public String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}
