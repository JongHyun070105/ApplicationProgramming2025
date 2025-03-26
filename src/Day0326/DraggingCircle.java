package Day0326;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DraggingCircle extends JFrame {
    public DraggingCircle() {
       setTitle("이미지 위에 원 드래깅");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       setContentPane(new Mypanel1());

       setSize(400,400);
       setVisible(true);
    }

    class Mypanel1 extends JPanel {
        private ImageIcon icon = new ImageIcon("img/back.jpg");
        private Image img =  icon.getImage();
        private int ovalX = 100;
        private int ovalY = 100;
        private final int RADIUS = 20;

        public Mypanel1() {
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    ovalX = e.getX();
                    ovalY = e.getY();
                    repaint(); // paintComponent 호출
                }
            });
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            g.setColor(Color.RED);
            g.fillOval(ovalX, ovalY, RADIUS, RADIUS);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DraggingCircle::new);
    }
}
