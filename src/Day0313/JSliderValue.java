package Day0313;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class JSliderValue extends JFrame {
    JSlider slider = new JSlider(100, 200, 150);
    JLabel la = new JLabel("      ");

    public JSliderValue(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(slider);
        cp.add(la);

        // slider 속성 지정
        slider.setMajorTickSpacing(20); // 눈금 거리
        slider.setPaintLabels(true); // 숫자
        slider.setPaintTicks(true); // 눈금

        // 레이블의 속성
        la.setHorizontalAlignment(JLabel.CENTER);
        la.setOpaque(true);
        la.setBackground(Color.GREEN);
        la.setText(Integer.toString(slider.getValue()));

        // 레이블 이벤트 처리
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                la.setText(Integer.toString(slider.getValue()));
            }
        });

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JSliderValue::new);
    }
}
