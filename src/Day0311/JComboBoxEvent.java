package Day0311;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxEvent extends JFrame {
    String[] fruits = {"apple","banana","kiwi","mango"};
    ImageIcon[] img = {new ImageIcon("img/apple.png"),
                       new ImageIcon("img/banana.png"),
                       new ImageIcon("img/kiwi.png"),
                       new ImageIcon("img/mango.png")};

    JLabel imgLabel = new JLabel(img[0]);
    JComboBox<String> strCombo = new JComboBox<>(fruits);

    public JComboBoxEvent() {
        setTitle("콤보 박스 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(strCombo);
        cp.add(imgLabel);

        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>) e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(img[index]);
                
            }
        });

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JComboBoxEvent());
    }
}
