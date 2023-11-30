import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Frame extends JFrame {
    final static int SIZE_X = 800;
    final static int SIZE_Y = 800;

    public static void createFrame() {
        Frame frame = new Frame();
        frame.setSize(SIZE_X, SIZE_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    Frame() {
        super("Exercise 9");
        setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();

        FirstTab firstTab = new FirstTab();
        SecondTab secondTab = new SecondTab();
        ThirdTab thirdTab = new ThirdTab();

        tabbedPane.addTab("First tab", firstTab);
        tabbedPane.addTab("Second tab", secondTab);
        tabbedPane.addTab("Third tab", thirdTab);
        add(tabbedPane);
    }

}
