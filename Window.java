import javax.swing.*;
import java.awt.*;

public class Window {
    private static final int windowWidth = 500;
    private static final int windowHeight = 300;

    private JButton button2Players;
    private JButton buttonTeams;
    private JButton buttonInstruction;
    private JButton buttonAbout;
    private JFrame frame;

    public Window() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SongGuesser");

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;


        frame.setBounds((screenWidth - windowWidth)/2, (screenHeight - windowHeight)/2, windowWidth, windowHeight);
        frame.setResizable(false);

        InitComponents();
    }

    private void InitComponents() {

        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(groupLayout);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        button2Players = new JButton("2 players");
        buttonTeams = new JButton("Teams");
        buttonInstruction = new JButton("Tutorial");
        buttonAbout = new JButton("About");

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(
                                groupLayout.createParallelGroup().addComponent(button2Players, 150, 150, 150).addComponent(buttonInstruction, 150, 150, 150)
                        )
                        .addGroup(
                                groupLayout.createParallelGroup().addComponent(buttonTeams, 150, 150, 150).addComponent(buttonAbout, 150, 150, 150)
                        )
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(
                                groupLayout.createParallelGroup().addComponent(button2Players, 150, 150, 150).addComponent(buttonTeams, 150, 150, 150)
                        )
                        .addGroup(
                                groupLayout.createParallelGroup().addComponent(buttonInstruction, 150, 150, 150).addComponent(buttonAbout, 150, 150, 150)
                        )
        );
        frame.pack();
    }

    private void addButtonsListeners() {

    }
}
