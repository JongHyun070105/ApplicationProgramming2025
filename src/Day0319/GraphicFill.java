package Day0319;

import javax.swing.*;
import java.awt.*;

public class GraphicFill extends JFrame {
    private MyPanel3 panel = new MyPanel3();

    public GraphicFill() {
        setTitle("그림 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(600,600);
        setVisible(true);
    }
    class MyPanel3 extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // 사각형
            g.setColor(Color.RED);
            g.fillRect(10,10, 50, 60);

            // 원
            g.setColor(Color.BLUE);
            g.fillOval(10,80,50,50);

            // 둥근 사각형
            g.setColor(Color.GREEN);
            g.fillRoundRect(10,140,50,50,20,20);

            // 잘린 원
            g.setColor(Color.ORANGE);
            g.fillArc(10,200,50,50,90,270);

            // 다각형
            g.setColor(Color.MAGENTA);
            int[] x = {30,10,30,60};
            int[] y = {260,280,300,280};
            g.fillPolygon(x,y,x.length);

            // 이등변 삼각형
            g.setColor(Color.CYAN);
            int[]  a = {30,10,50};
            int[]  b = {310,360,360};
            g.fillPolygon(a,b,a.length);

        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GraphicFill::new);
    }
}
