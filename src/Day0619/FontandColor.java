package Day0619;

import javax.swing.*;
import java.awt.*;

public class FontandColor extends JFrame {
    MyPanel mp = new MyPanel();
    public FontandColor(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(mp);

        setSize(400,500);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.blue);
            g.drawString("I Love Java.~~",30,30);

            g.setColor(Color.red);
            g.setFont(new Font("Gothic", Font.ITALIC, 30));
            g.drawString("How much??",30, 60);

            g.setColor(Color.magenta);
            for (int i = 1; i<=5;i++){
                g.setFont(new Font("Jokerman", Font.ITALIC, i * 10));
                g.drawString("This much!!", 30, 60 + (i * 60));
            }
        }
    }

    public static void main(String[] args) {
        new FontandColor();
    }
}
