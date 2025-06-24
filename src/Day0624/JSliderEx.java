package Day0624;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderEx extends JFrame {
    JSlider js = new JSlider(1, 100, 60);
    JLabel la = new JLabel("I Love Java");

    public JSliderEx() {
        la.setFont(new Font("Gothic", Font.BOLD, 60));
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        js.setMajorTickSpacing(20);
        js.setMinorTickSpacing(5);
        js.setPaintLabels(true);
        js.setPaintTicks(true);

        js.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                la.setFont(new Font(
                        "Gothic", Font.BOLD, js.getValue()));
            }
        });


        cp.add(la, BorderLayout.CENTER);
        cp.add(js, BorderLayout.NORTH);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JSliderEx();
    }
}