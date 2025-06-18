package Day0618;

import javax.swing.*;
import java.awt.*;

public class SwingEx extends JFrame{
    public SwingEx() {
        setTitle("스윙 컴포넌트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("클릭"));
        contentPane.add(new JLabel("라벨입니다"));
        contentPane.add(new TextField(15));

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingEx();
    }
}