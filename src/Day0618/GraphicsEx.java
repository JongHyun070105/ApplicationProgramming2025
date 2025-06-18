package Day0618;

import javax.swing.*;
import java.awt.*;

public class GraphicsEx extends JFrame {
    Mypanel p = new Mypanel();
    public GraphicsEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(p);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsEx();
    }
}

class Mypanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int[] xPoints = {30, 10, 30, 60};
        int[] yPoints = {250, 275, 300, 275};
        int nPoints = 4;

        g.setColor(Color.red);
        g.fillRect(10,10,50,50);
        g.setColor(Color.blue);
        g.fillOval(10,70,50,50);
        g.setColor(Color.green);
        g.fillRoundRect(10, 130, 50,50,10,10);
        g.setColor(Color.magenta);
        g.fillArc(10, 190, 50, 50,0,270);
        g.setColor(Color.orange);
        g.fillPolygon(xPoints,yPoints,nPoints);
    }
}
