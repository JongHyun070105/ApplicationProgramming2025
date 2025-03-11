package Day0311;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    public SliderEx() {
        setTitle("슬라이더 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,10);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        cp.add(slider);

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(SliderEx::new);
    }
}
