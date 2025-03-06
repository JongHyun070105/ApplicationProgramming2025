package Day0306;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonEvent extends JFrame {
    JRadioButton[] rb = new JRadioButton[3];
    String[] names = {"Apple", "Cherry", "Pear"};
    ImageIcon[] img = {new ImageIcon("img/apple.png"),
                       new ImageIcon("img/cherry.jpg"),
                       new ImageIcon("img/pear.png")};
    JLabel imgLa = new JLabel();

    public RadioButtonEvent() {
        setTitle("라디오 버튼 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup buttonGroup = new ButtonGroup();

        for (int i = 0; i < rb.length; i++) {
            rb[i] = new JRadioButton(names[i]);
            buttonGroup.add(rb[i]);
            radioPanel.add(rb[i]);
            rb[i].addItemListener(new MyItemListener());
        }

        rb[0].setSelected(true);

        cp.add(radioPanel, BorderLayout.NORTH);
        cp.add(imgLa, BorderLayout.CENTER);

        // 위치
        imgLa.setHorizontalAlignment(SwingConstants.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.DESELECTED) {
              return;
            }
            if(rb[0].isSelected()) {
                imgLa.setIcon(img[0]);
            } else if(rb[1].isSelected()) {
                imgLa.setIcon(img[1]);
            } else if(rb[2].isSelected()) {
                imgLa.setIcon(img[2]);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RadioButtonEvent());
    }
}
