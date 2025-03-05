package Day0305;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx(){
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        ImageIcon cherryicon = new ImageIcon("img/cherry.jpg");
        ImageIcon chkcherry = new ImageIcon("img/cherry_ckb.jpg");

        JCheckBox apple = new JCheckBox("Apple");
        apple.setSelected(true); // 시작할때부터 체크 되어있게 하는 것

        JCheckBox orange = new JCheckBox("Orange");
        JCheckBox cherry = new JCheckBox("Cherry", cherryicon);

        cherry.setBorderPainted(true); // 체리에 테두리가 생김
        cherry.setSelectedIcon(chkcherry); // 체리가 선택되었을 때 바뀔 이미지 아이콘 -> chkcherry

        cp.add(cherry);
        cp.add(apple);
        cp.add(orange);

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CheckBoxEx());
    }
}
