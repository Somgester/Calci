import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JTextField input1, input2;
    private JButton addButton;
    private JLabel resultLabel;

    public App() {
        setLayout(new FlowLayout());

        input1 = new JTextField(5);
        input2 = new JTextField(5);
        addButton = new JButton("Add");
        resultLabel = new JLabel("Result: ");

        add(input1);
        add(input2);
        add(addButton);
        add(resultLabel);

        event e = new event();
        addButton.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double sum = num1 + num2;

            resultLabel.setText("Result: " + sum);
        }
    }

    public static void main(String[] args) {
        App gui = new App();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(200, 200);
        gui.setTitle("Simple Calculator");
    }
}
