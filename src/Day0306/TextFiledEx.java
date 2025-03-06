package Day0306;

import javax.swing.*;
import java.awt.*;

public class TextFiledEx extends JFrame {
    public TextFiledEx() {
        setTitle("텍스트 필드 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("이름"));
        cp.add(new JTextField(10));
        cp.add(new JLabel("학과"));
        cp.add(new JTextField(10));
        cp.add(new JLabel("전화"));
        cp.add(new JTextField(10));

        setSize(170,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextFiledEx());
    }
}
