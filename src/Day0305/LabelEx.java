package Day0305;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel text = new JLabel("사랑해요 자바");

        // 자바에서 컴포넌트에 이미지를 올리기 -> 이미지 아이콘 객체 생성
        ImageIcon img = new ImageIcon("img/img1.png");
        JLabel imgLabel = new JLabel(img); // JLabel로 ImageIcon을 imgLabel 에 넣는다

        ImageIcon tel = new ImageIcon("img/img_1.png");
        JLabel total = new JLabel("자바 모르면 전화하세요", tel, SwingConstants.CENTER);

        cp.add(text);
        cp.add(imgLabel);
        cp.add(total);

        setSize(600,1000);
        setVisible(true);
    }

    public static void main(String[] args) {
//      new LabelEx();  => 이렇게 작성하면 쓰레드 관리가 안된다 XXXX
        SwingUtilities.invokeLater(() -> new LabelEx()); // Runnable의 run()을 람다식으로 표현함
    }
}
