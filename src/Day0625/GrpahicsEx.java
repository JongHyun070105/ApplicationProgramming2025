package Day0625;

import javax.swing.*;
import java.awt.*;

public class GrpahicsEx extends JFrame {
    MyPanel p = new MyPanel();
    public GrpahicsEx(){
        setTitle("도형 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(p);

        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.red);
            g.fillRect(0, 20, 50, 50);
            g.setColor(Color.blue);
            g.fillOval(0, 80, 50, 50);
            g.setColor(Color.green);
            g.fillRoundRect(0, 140,50,50,20,20);
        }
    }

    public static void main(String[] args) {
        new GrpahicsEx();
    }
}

