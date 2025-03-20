package Day0320;

import javax.swing.*;
import java.awt.*;

public class PaintComponentEx extends JFrame {
    public PaintComponentEx() {
        setTitle("새로운 버튼 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        MyButton btn = new MyButton("New Button");
        btn.setOpaque(true);
        btn.setBackground(Color.GREEN);

        cp.add(btn);

        setSize(300,300);
        setVisible(true);
    }

    class MyButton extends JButton {
        public MyButton(String s) {
            super(s);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawOval(0,0,this.getWidth() - 5,this.getHeight() - 5);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaintComponentEx::new);
    }
}
