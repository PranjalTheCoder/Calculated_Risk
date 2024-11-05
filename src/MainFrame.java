import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Calculated Risk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        BasicCalculatorPanel basicCalculatorPanel = new BasicCalculatorPanel();
        add(basicCalculatorPanel);

        // Set a custom look and feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
