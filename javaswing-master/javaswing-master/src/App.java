import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel MainPanel;
    private JTextField txtInput;
    private JButton clickMeButton;
    private JCheckBox chkRemember;
    private JComboBox cboAnimal;
    private JProgressBar progress;

    public App() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                progress.setValue(20);

                String strUserInputted = txtInput.getText();
                Boolean isRemember = chkRemember.isSelected();
                String selectedAnimal = cboAnimal.getSelectedItem().toString();

                JOptionPane.showMessageDialog(null, strUserInputted + "\nRemember: " + isRemember + "\nSelected Animal: " + selectedAnimal);
            }
        });
        chkRemember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboAnimal.setVisible(chkRemember.isSelected());
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
