import java.util.List;

public class Calculator {
    private HistoryManager historyManager;

    public Calculator() {
        historyManager = new HistoryManager();
    }

    public double add(double a, double b) {
        double result = a + b;
        historyManager.addToHistory(a + " + " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        historyManager.addToHistory(a + " - " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        historyManager.addToHistory(a + " * " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        double result = a / b;
        historyManager.addToHistory(a + " / " + b + " = " + result);
        return result;
    }

    public List<String> getHistory() {
        return historyManager.getHistory();
    }

    public void displayHistory() {
        historyManager.displayHistory();
    }
}