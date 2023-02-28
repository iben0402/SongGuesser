import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryPick extends JFrame{
    private JLabel welcomeText;
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JButton startButton;

    CategoryPick(String firstPlayer, String secondPlayer) {
        setTitle("Pick a category");
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int windowWidth = 250;
        int windowHeight = 200;
        setBounds((screenWidth - windowWidth)/2, (screenHeight - windowHeight)/2,windowWidth, windowHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        String welcome = welcomeText.getText() + " " + firstPlayer + " and " + secondPlayer;
        welcomeText.setText(welcome);

        comboBox1.addItem("Rap");
        comboBox1.addItem("Pop");
        comboBox1.addItem("80s");
        comboBox1.addItem("90s");
        comboBox1.addItem("00s");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String categ = (String) comboBox1.getSelectedItem();
                new TwoPlayers(firstPlayer, secondPlayer, categ);
                dispose();
            }
        });

        add(mainPanel);
    }
}
