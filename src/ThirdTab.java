import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;

public class ThirdTab extends JPanel {
    ThirdTab() {
        super();
        setLayout(new BorderLayout());

        JLabel name = new JLabel("Towns");
        add(name, BorderLayout.NORTH);
        name.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel radioButtonsPanel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        add(radioButtonsPanel, BorderLayout.CENTER);

        JRadioButton[] radioButtons = new JRadioButton[6];
        String[] radioButtonTexts = {"Minsk", "Brest", "Vitebsk", "Grodno", "Gomel", "Mogilev"};

        ImageIcon icon = new ImageIcon("src/colors/red.jpg");
        ImageIcon pressedIcon = new ImageIcon("src/colors/yellow.jpg");
        ImageIcon rolloverIcon = new ImageIcon("src/colors/green.jpg");
        ImageIcon selectedIcon = new ImageIcon("src/colors/navy.jpg");


        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton();
            radioButtons[i].setText(radioButtonTexts[i]);

            radioButtons[i].setIcon(icon);
            radioButtons[i].setPressedIcon(pressedIcon);
            radioButtons[i].setRolloverIcon(rolloverIcon);
            radioButtons[i].setSelectedIcon(selectedIcon);

            buttonGroup.add(radioButtons[i]);
            radioButtonsPanel.add(radioButtons[i]);
        }


    }
}
