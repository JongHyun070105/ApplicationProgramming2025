package Day0619;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider extends JFrame {

    Container contentPane;
    JLabel colorLabel;
    JSlider [] sl = new JSlider [3];

    Slider() {
        setTitle("슬라이더와 ChangeEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        colorLabel = new JLabel("        SLIDER 테스트       ");

        for(int i=0; i<sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 50);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);

            sl[i].addChangeListener(new MyChangeListener());
            contentPane.add(sl[i]);
        }

        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);

        colorLabel.setOpaque(true);
        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();
        colorLabel.setBackground(new Color(r,g,b));

        contentPane.add(colorLabel);
        setSize(300,230);
        setVisible(true);
    }


    class MyChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            colorLabel.setBackground(new Color(r,g,b));
        }
    }
    public static void main(String [] args) {
        new Slider();
    }
}