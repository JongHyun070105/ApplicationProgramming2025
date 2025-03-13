package Day0313;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderFont extends JFrame {
    JSlider slider = new JSlider(0, 100, 50);
    JLabel la = new JLabel("      ");

    public JSliderFont() {
        this.setTitle("JSlider Practice Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel la = new JLabel("Font Size : " + slider.getValue());
        la.setHorizontalAlignment(JLabel.CENTER);
        la.setFont(new Font("궁서체",Font.ITALIC,50));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider js=(JSlider)e.getSource();
                la.setFont(new Font("궁서체",Font.ITALIC,js.getValue()));
                la.setText("Font Size : " + Integer.toString(slider.getValue()));

            }
        });

        this.add(slider, BorderLayout.NORTH);
        this.add(la, BorderLayout.CENTER);

        this.setSize(600,500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JSliderFont::new);
    }
}
