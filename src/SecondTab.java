import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SecondTab extends JLabel{
    JButton[][] buttons = new JButton[10][10];
    //ImageIcon defaultIcon = new ImageIcon("src/colors/blue.jpg");
    //ImageIcon rolloverIcon = new ImageIcon("src/colors/orange.jpg");
    Color defaultColor = Color.cyan;
    Color enteredColor = Color.blue;
    String oldText;
    SecondTab() {
        super();
        setLayout(new GridLayout(10, 10));
        setVisible(true);
        initButtons();
    }

    private void initButtons() {
        int counter = 1;

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                oldText = button.getText();
                button.setText("Clicked!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                button.setText(oldText);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                button.setBackground(enteredColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                button.setBackground(defaultColor);
            }
        };

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setText(String.valueOf(counter));
                buttons[i][j].setBackground(defaultColor);
                buttons[i][j].addMouseListener(mouseListener);
                add(buttons[i][j]);
                counter++;
            }
        }
    }
}
