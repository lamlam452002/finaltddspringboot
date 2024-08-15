import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel MainPanel;
    private JTextField helloSamsungSDSWelcomeTextField;
    private JButton clickMeButton;
    private JTextPane txtInput;
    private JCheckBox checkBox1;

    public App() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strUserInput = txtInput.getText();
                JOptionPane.showMessageDialog(null, strUserInput);
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strUserInput = checkBox1.getText();
                Boolean isRememberMe = checkBox1.isSelected();
                JOptionPane.showMessageDialog(null,  isRememberMe);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setContentPane(new App().MainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
