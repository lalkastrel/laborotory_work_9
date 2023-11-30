import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;


public class FirstTab extends JPanel {
    final String[] leftData = {"1", "2", "3", "4", "5", "6", "7", "8"};
    final String[] rightData = {"9", "10", "11", "12", "13", "14", "15", "16"};
    DefaultListModel<String> leftListModel = new DefaultListModel<>();
    DefaultListModel<String> rightListModel = new DefaultListModel<>();
    Font font = new Font("Arial", Font.PLAIN, 30);

    FirstTab() {
        super();
        setLayout(new BorderLayout());

        JList<String> leftList = new JList<>(leftListModel);
        JList<String> rightList = new JList<>(rightListModel);
        leftList.setFont(font);
        rightList.setFont(font);
        add(leftList,BorderLayout.WEST);
        add(rightList, BorderLayout.EAST);
        initLists();

        JPanel center = new JPanel(new BorderLayout());
        Button moreSignButton = new Button(">");
        Button lessSignButton = new Button("<");
        moreSignButton.setFont(font);
        lessSignButton.setFont(font);
        center.add(moreSignButton, BorderLayout.NORTH);
        center.add(lessSignButton, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);

        lessSignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferFromFirstToSecond(rightList, rightListModel, leftListModel);
            }
        });

        moreSignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferFromFirstToSecond(leftList, leftListModel, rightListModel);
            }
        });


    }

    private void initLists() {
        leftListModel.addAll(Arrays.stream(leftData).toList());
        rightListModel.addAll(Arrays.stream(rightData).toList());
    }

    private void transferFromFirstToSecond(JList<String> firstList, DefaultListModel<String> firstListModel,
                                           DefaultListModel<String> secondListModel) {
        int[] selectedInteger = firstList.getSelectedIndices();
        for (int i : selectedInteger) {
            secondListModel.addElement(firstListModel.get(i));
        }
        for (int i = selectedInteger.length - 1; i >= 0; i--) {
            firstListModel.remove(selectedInteger[i]);
        }
    }

}
