package Day0326;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlusMinusImage extends JFrame {
    public PlusMinusImage() {
        setTitle("PlusMinusImage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel3());
        setSize(300,300);
        setVisible(true);

        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    class MyPanel3 extends JPanel{
        private ImageIcon icon = new ImageIcon("img/apple.png");
        private Image img =  icon.getImage();
        private int width, height;

        public MyPanel3(){
            width = img.getWidth(this);
            height = img.getHeight(this);

            addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent e){
                    if(e.getKeyChar() == '+'){
                        width = (int)(width*1.1);
                        height = (int)(height*1.1);
                        repaint();
                    } else if(e.getKeyChar() == '-'){
                        width = (int)(width*0.9);
                        height = (int)(height*0.9);
                        repaint();
                    }
                }
            });
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,10,10,width,height,this);

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PlusMinusImage::new);
    }
}
