import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public double add(double a, double b) {
        double result = a + b;
        history.add(a + " + " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        history.add(a + " - " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        history.add(a + " * " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        double result = a / b;
        history.add(a + " / " + b + " = " + result);
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}