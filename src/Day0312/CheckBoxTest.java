package Day0312;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxTest extends JFrame {

    public CheckBoxTest() {
        setTitle("CheckBoxTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JButton btn = new JButton("Test Button");
        JCheckBox a = new JCheckBox("버튼 비활성화");
        JCheckBox b = new JCheckBox("버튼 감추기");

        cp.add(a);
        cp.add(b);
        cp.add(btn);

        a.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    btn.setEnabled(false);
                }
                else{
                    btn.setEnabled(true);
                }
            }
        });

        b.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    btn.setVisible(false);
                }
                else{
                    btn.setVisible(true);
                }
            }
        });

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CheckBoxTest::new);
    }
}
