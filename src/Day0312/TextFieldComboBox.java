package Day0312;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldComboBox extends JFrame {
    public TextFieldComboBox() {
        JTextField tf = new JTextField(10);
        JComboBox<String> cb = new JComboBox<>();

        setTitle("콤보박스 아이템 추가");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(tf);
        cp.add(cb);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField tf = (JTextField)e.getSource();
                cb.addItem(tf.getText());
                tf.setText("");
            }
        });

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextFieldComboBox::new);
    }
}
