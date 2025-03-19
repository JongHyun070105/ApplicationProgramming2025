package Day0319;

import javax.swing.*;
import java.awt.*;

public class DrawImageEx extends JFrame {
    private MyPanel4 panel = new MyPanel4();

    public DrawImageEx() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(600,600);
        setVisible(true);
    }

    class MyPanel4 extends JPanel {
        ImageIcon img = new ImageIcon("img/football.png");
        Image img1 = img.getImage(); // 이미지 객체

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
//            g.drawImage(img1,20,20,this);
//            g.drawImage(img1,0,0,getWidth(),getHeight(),this);
//            g.drawImage(img1,20,20,250,100,100,50,200,200,this);
            g.setClip(100,20,150,150);
            g.drawImage(img1,0,0,getWidth(),getHeight(),this);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial",Font.ITALIC,40));
            g.drawString("Go Gator!",10,150);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawImageEx::new);
    }
}
