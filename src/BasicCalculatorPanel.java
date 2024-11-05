import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class BasicCalculatorPanel extends JPanel {
    private JTextField inputField;
    private JTextArea historyArea;
    private ArrayList<String> history;

    public BasicCalculatorPanel() {
        setLayout(new BorderLayout());

        inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        history = new ArrayList<>();
        historyArea = new JTextArea(10, 20);
        historyArea.setEditable(false);
        add(new JScrollPane(historyArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+" };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("C")) {
                inputField.setText("");
            } else if (command.equals("=")) {
                try {
                    String expression = inputField.getText();
                    double result = evaluateExpression(expression);
                    String resultText = expression + " = " + result;
                    history.add(resultText);
                    historyArea.setText(String.join("\n", history));
                    inputField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    inputField.setText("Error");
                }
            } else {
                inputField.setText(inputField.getText() + command);
            }
        }
    }

    private double evaluateExpression(String expression) throws ScriptException {
        // Use JavaScript engine to evaluate expressions
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        return Double.parseDouble(engine.eval(expression).toString());
    }
}
