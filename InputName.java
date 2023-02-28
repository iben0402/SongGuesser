import javax.swing.*;
import java.awt.*;

public class InputName extends JFrame {
    private String firstName;
    private String secondName;
    private final JTextField firstTextField;
    private final JTextField secondTextField;
    JButton button;

    public InputName(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firstDescription = new JLabel("First player:");
        firstDescription.setBounds(10, 10, 200, 30);

        firstTextField = new JTextField("player1");
        firstTextField.setBounds(10, 50, 200, 30);

        JLabel secondDescription = new JLabel("Second player:");
        secondDescription.setBounds(10, 90, 200, 30);

        secondTextField = new JTextField("player2");
        secondTextField.setBounds(10, 130, 200, 30);

        button = new JButton("Start");
        button.setBounds(10, 170, 100, 30);
        button.addActionListener(e -> {
            firstName = firstTextField.getText();
            secondName = secondTextField.getText();
            new CategoryPick(firstName, secondName);
            dispose();

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

}
