package Day0305;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    public ButtonEx() {
        setTitle("이미지 버튼 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        ImageIcon normal = new ImageIcon("img/img.png"); // 이미지를 올리기 위해 이미지 아이콘 생성
        ImageIcon rollover = new ImageIcon("img/img_1.png");
        ImageIcon presse = new ImageIcon("img/img_2.png");

        JButton btn =  new JButton("전화",normal); // 기본 상태의 버튼 생성

        btn.setPressedIcon(presse); // presse 시 이미지 변경
        btn.setRolloverIcon(rollover); // rollover 시 이미지 변경


        cp.add(btn); // 이미지 버튼 추가

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonEx());
    }
}
