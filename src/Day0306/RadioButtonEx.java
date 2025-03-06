package Day0306;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("라디오버튼 예제 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        ButtonGroup buttonGroup = new ButtonGroup(); // 중복 선택 방지를 위해 그룹으로 묶음

        JRadioButton jbtn1 =  new JRadioButton("apple");
        JRadioButton jbtn2 =  new JRadioButton("pear");
        JRadioButton jbtn3 =  new JRadioButton("cherry");

        buttonGroup.add(jbtn1); // 그룹에 추가함
        buttonGroup.add(jbtn2);
        buttonGroup.add(jbtn3);

        cp.add(jbtn1);
        cp.add(jbtn2);
        cp.add(jbtn3);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RadioButtonEx());
    }
}
