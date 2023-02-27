import javax.swing.*;

public class Window {
    public Window() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Guess the song");
        frame.setSize(800, 600);
    }
}
