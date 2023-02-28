import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private static final int windowWidth = 500;
    private static final int windowHeight = 300;

    private JButton button2Players;
    private JButton buttonTeams;
    private JButton buttonInstruction;
    private JButton buttonAbout;
    private final JFrame frame;

    public enum buttons {
        TWOPLAYERS, TEAMS, INSTRUCTION, ABOUT
    }

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
        addButtonsListeners();
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

    private class ButtonListener implements ActionListener {
        buttons button;
        public ButtonListener(buttons b) {
            this.button = b;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (button) {
                case ABOUT -> System.out.println("about");
                case INSTRUCTION -> System.out.println("instruction");
                case TWOPLAYERS -> {
                    InputName first = new InputName("Enter name of first player");
                    InputName second = new InputName("Enter name of second player");
                    String firstPlayer = first.getName();
                    String secondPlayer = second.getName();
                    //todo reading players name correctly

                }
                case TEAMS -> System.out.println("teams");
            }
        }
    }

    private void addButtonsListeners() {
        button2Players.addActionListener(new ButtonListener(buttons.TWOPLAYERS));
        buttonTeams.addActionListener(new ButtonListener(buttons.TEAMS));
        buttonInstruction.addActionListener(new ButtonListener(buttons.INSTRUCTION));
        buttonAbout.addActionListener(new ButtonListener(buttons.ABOUT));
    }
}
