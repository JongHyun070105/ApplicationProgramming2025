package Day0326;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DraggingImage extends JFrame {
    public DraggingImage(){
        setTitle("이미지 마우스 드래깅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel2());
        setSize(300,300);
        setVisible(true);
    }

    class MyPanel2 extends JPanel{
        private ImageIcon icon = new ImageIcon("img/apple.png");
        private Image img =  icon.getImage();
        private int width, height;
        private int x = 100, y = 100;

        public MyPanel2(){
            width = img.getWidth(this);
            height = img.getHeight(this);
            MyMouseListener ml = new MyMouseListener();
            addMouseListener(ml);
            addMouseMotionListener(ml);
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,x,y,width,height,this);
        }

        class MyMouseListener extends MouseAdapter {
            private Point startP = null;
            private Point endP = null;
            private boolean bDrag = false;

            @Override
            public void mousePressed(MouseEvent e) {
                startP = e.getPoint();
                if((startP.x >= x && startP.x <= x+width) && (startP.y >= y && startP.y <= y+height)){
                    bDrag = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if(bDrag == false){
                    return;
                }
                Point endP = e.getPoint();
                x = x + endP.x - startP.x;
                y = y + endP.y - startP.y;
                repaint();

                bDrag = false;
            }

            @Override
            public void mouseDragged(MouseEvent e){
                if(bDrag == false){
                    return;
                }
                Point endP = e.getPoint();
                x =  x + endP.x - startP.x;
                y = y + endP.y - startP.y;

                startP = endP;
                repaint();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DraggingImage::new);
    }
}
