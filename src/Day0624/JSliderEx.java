package Day0624;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderEx extends JFrame {
    JSlider js = new JSlider(1, 100, 50);
    JLabel la = new JLabel("I Love Java");

    public JSliderEx() {
        setTitle("슬라이더로 글자 크기 조정");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        la.setHorizontalAlignment(SwingConstants.CENTER);
        la.setFont(new Font("Gothic", Font.PLAIN, js.getValue()));

        // 슬라이더 속성
        js.setMajorTickSpacing(20); // 큰 눈금
        js.setMinorTickSpacing(5); // 작은 눈금
        js.setPaintLabels(true); // 숫자 레이블 표현
        js.setPaintTicks(true); // 눈금 표현

        // slider value에 따른 폰트 크기 변경 리스너
        js.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                la.setFont(new Font(
                        "Gothic", Font.PLAIN, js.getValue()));
            }
        });

        // 컨테이너에 추가
        cp.add(la, BorderLayout.CENTER);
        cp.add(js, BorderLayout.NORTH);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JSliderEx();
    }
}