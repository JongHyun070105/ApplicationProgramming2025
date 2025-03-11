package Day0311;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderEvent extends JFrame {
    JLabel colorLable;
    JSlider[] sl = new JSlider[3];
    public SliderEvent() {
        setTitle("슬라이더 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        colorLable = new JLabel("슬라이더 색 바꾸기");

        for (int i = 0; i < sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            sl[i].addChangeListener(new MyChangeListener());
            cp.add(sl[i]);
        }

        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);

        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();

        colorLable.setOpaque(true);
        colorLable.setBackground(new Color(r,g,b));

        cp.add(colorLable);

        setSize(400, 400);
        setVisible(true);
    }

    class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            colorLable.setBackground(new Color(r,g,b));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SliderEvent::new);
    }
}
