import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private List<String> history;

    public HistoryManager() {
        history = new ArrayList<>();
    }

    // Add a calculation to the history
    public void addToHistory(String calculation) {
        history.add(calculation);
    }

    // Retrieve the entire history
    public List<String> getHistory() {
        return history;
    }

    // Clear the history
    public void clearHistory() {
        history.clear();
    }

    // Display the history
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculations in history.");
        } else {
            System.out.println("Calculation History:");
            for (String entry : history) {
                System.out.println(entry);
            }
        }
    }
}