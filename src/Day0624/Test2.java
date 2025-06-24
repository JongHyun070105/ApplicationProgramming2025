package Day0624;

import javax.swing.*;
import java.awt.*;

public class Test2 extends JFrame {
    MyPanel p = new MyPanel();
    public Test2(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(p);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test2();
    }

    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.red);
            g.fillRect(10,30,50,50);
        }
    }
}
