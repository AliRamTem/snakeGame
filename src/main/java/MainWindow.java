import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2,
                (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
