import javax.swing.*;
import java.awt.*;

public class Window {
    private static final int windowWidth = 800;
    private static final int windowHeight = 600;

    private JButton button2Players;
    private JButton buttonTeams;
    private JButton buttonInstruction;
    private JFrame frame;
    private JLabel description;
    public Window() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Guess the song");

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;


        frame.setBounds((screenWidth - windowWidth)/2, (screenHeight - windowHeight)/2, windowWidth, windowHeight);
        frame.setResizable(false);

        InitComponents();
    }

    private void InitComponents() {


        description = new JLabel();
        description.setText("Welcome in SongGuesser. You can play with in 2 player mode or team mode.");

        button2Players = new JButton("2 players");
        button2Players.setPreferredSize(new Dimension(200, 100));
        buttonTeams = new JButton("Teams");
        buttonTeams.setPreferredSize(button2Players.getPreferredSize());
        buttonInstruction = new JButton("How to play");
        buttonInstruction.setPreferredSize(button2Players.getPreferredSize());

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        panel.add(description);
        panel.add(button2Players);
        panel.add(buttonTeams);
        panel.add(buttonInstruction);


        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}
