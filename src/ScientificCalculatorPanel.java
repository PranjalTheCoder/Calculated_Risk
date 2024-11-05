import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ScientificCalculatorPanel extends JPanel {
    private JTextField inputField;
    private JTextArea historyArea;

    public ScientificCalculatorPanel() {
        setLayout(new BorderLayout());

        inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        historyArea = new JTextArea(10, 20);
        historyArea.setEditable(false);
        add(new JScrollPane(historyArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        String[] buttons = { "GCD", "LCM", "Sin", "Cos", "Tan", "Rad", "Deg", "Clear", "=" };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ScientificButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private class ScientificButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            String input = inputField.getText();

            try {
                switch (command) {
                    case "GCD":
                        int gcdResult = gcd(parseInput(input));
                        updateHistory("GCD", input, gcdResult);
                        break;
                    case "LCM":
                        int lcmResult = lcm(parseInput(input));
                        updateHistory("LCM", input, lcmResult);
                        break;
                    case "Sin":
                        double sinResult = Math.sin(Math.toRadians(Double.parseDouble(input)));
                        updateHistory("Sin", input, sinResult);
                        break;
                    case "Cos":
                        double cosResult = Math.cos(Math.toRadians(Double.parseDouble(input)));
                        updateHistory("Cos", input, cosResult);
                        break;
                    case "Tan":
                        double tanResult = Math.tan(Math.toRadians(Double.parseDouble(input)));
                        updateHistory("Tan", input, tanResult);
                        break;
                    case "Rad":
                        double radResult = Math.toRadians(Double.parseDouble(input));
                        updateHistory("Rad", input, radResult);
                        break;
                    case "Deg":
                        double degResult = Math.toDegrees(Double.parseDouble(input));
                        updateHistory("Deg", input, degResult);
                        break;
                    case "Clear":
                        inputField.setText("");
                        break;
                    case "=":
                        inputField.setText(inputField.getText());
                        break;
                }
            } catch (Exception ex) {
                inputField.setText("Error");
            }
        }
    }

    private int[] parseInput(String input) {
        String[] parts = input.split(",");
        return new int[]{ Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) };
    }

    private int gcd(int[] nums) {
        int a = nums[0], b = nums[1];
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int[] nums) {
        int a = nums[0], b = nums[1];
        return a * (b / gcd(nums));
    }

    private void updateHistory(String operation, String input, Object result) {
        String resultText = operation + "(" + input + ") = " + result;
        historyArea.append(resultText + "\n");
        inputField.setText(String.valueOf(result));
    }
}
