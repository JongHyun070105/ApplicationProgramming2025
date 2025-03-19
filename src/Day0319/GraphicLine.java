package Day0319;

import javax.swing.*;
import java.awt.*;

public class GraphicLine extends JFrame {
    private MyPanel2 panel = new MyPanel2();

    public GraphicLine() {
        setTitle("선긋기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(600,600);
        setVisible(true);
    }

    class MyPanel2 extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(new Color(200,100,100));
            g.drawLine(20,20,120,120);
            g.drawOval(100,100,80,80);
            g.drawRoundRect(150,150,250,200,10,100);
            g.setColor(Color.PINK);
            g.drawArc(20,300,80,200,90,270);
            g.setColor(Color.BLACK);

            int[] x = {80,40,80,120,100,203,394,289,278,364,263};
            int[] y = {40,120,200,120,239,293,102,384,283,165};
            g.drawPolygon(x,y,10);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GraphicLine::new);
    }
}
