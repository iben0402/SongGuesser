import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputName extends JFrame {
    private String name;
    private JTextField textField;
    public InputName(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);

        JButton button = new JButton("Enter");
        button.setBounds(10, 50, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = textField.getText();
                System.out.println("Text entered: " + name);
                dispose();
            }
        });

        add(textField);
        add(button);

        setSize(300, 200);
        setLayout(null); // set layout to null to position components manually
        setVisible(true);
    }

    @Override
    public String getName() {
        return name;
    }
}
