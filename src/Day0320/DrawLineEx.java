package Day0320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class DrawLineEx extends JFrame {
    private MyPanel panel = new MyPanel();
    public DrawLineEx() {
        setTitle("선그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        Vector<Point> vStart = new Vector<>();
        Vector<Point> vEnd = new Vector<>();
        public MyPanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e){
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }

                @Override
                public void mouseReleased(MouseEvent e){
                    Point endP = e.getPoint();
                    vEnd.add(endP);
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.MAGENTA);
            for(int i = 0; i < vStart.size(); i++){
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);
                g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawLineEx::new);
    }
}
