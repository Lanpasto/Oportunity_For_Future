import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton clearButton;
    private JLabel lblWelcome;
    private JPanel mainPannel;

    public test() {
       setContentPane(mainPannel);
       setTitle("Welcome");
       setSize(450,300);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                String lastName = textField2.getText();
                lblWelcome.setText("Welcome " + firstName + " " + lastName);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                lblWelcome.setText("");


                System.out.print("welcome");

            }
        });
    }

    public static void main(String[] args) {
        test MyFrame = new test();

    }
}
