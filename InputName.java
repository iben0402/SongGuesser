import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputName extends JFrame {
    private String firstName;
    private String secondName;
    private JTextField firstTextField;
    private JTextField secondTextField;
    JButton button;

    public InputName(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firstDescription = new JLabel("First player:");
        firstDescription.setBounds(10, 10, 200, 30);

        firstTextField = new JTextField();
        firstTextField.setBounds(10, 50, 200, 30);

        JLabel secondDescription = new JLabel("Second player:");
        secondDescription.setBounds(10, 90, 200, 30);

        secondTextField = new JTextField();
        secondTextField.setBounds(10, 130, 200, 30);

        button = new JButton("Start");
        button.setBounds(10, 170, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstName = firstTextField.getText();
                secondName = secondTextField.getText();
                dispose();
            }
        });

        add(firstDescription);
        add(firstTextField);
        add(secondDescription);
        add(secondTextField);
        add(button);

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int windowWidth = 250;
        int windowHeight = 300;


        setBounds((screenWidth - windowWidth)/2, (screenHeight - windowHeight)/2,windowWidth, windowHeight);
        setLayout(null); // set layout to null to position components manually
        setVisible(true);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public JButton getButton() {
        return button;
    }

}
