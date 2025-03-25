package Day0325;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.*;

public class ClipAndKey extends JFrame {
    class ImagePanel extends JPanel{
        private Image img = null;
        private int clipX = 0 , clipY = 0;

        public ImagePanel(){
            img = new ImageIcon("img/bg.jpg").getImage();
            this.addMouseListener(new MouseAdapter(){
                @Override
                public void mousePressed(MouseEvent e) {
                    JPanel panel = (JPanel)e.getSource();
                    panel.requestFocus();
                }
            });
            this.addKeyListener(new MyKeyListener());
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setClip(clipX, clipY, 100,100);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            g.drawString("자바",40,340);
        }

        class MyKeyListener extends KeyAdapter {
            @Override
            public void keyPressed(KeyEvent e){
                // 상하좌우 키는 유니코드 키가 아니므로 getKeyCode()로 키 값을 알아내
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP :
                        clipY -= 10;
                        if(clipY < 0)
                            clipY = 0;
                        break;

                    case KeyEvent.VK_DOWN :
                        clipY += 10;
                        if(clipY > getHeight())
                            clipY -= 10;
                        break;

                    case KeyEvent.VK_LEFT:
                        clipX -= 10;
                        if(clipX < 0)
                            clipX = 0;
                        break;

                    case KeyEvent.VK_RIGHT:
                        clipX += 10;
                        if(clipX >= getWidth())
                            clipX -= 10;
                        break;

                }
                repaint();
            }
        }
    }

    public ClipAndKey() {
        setTitle("이미지 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImagePanel p = new ImagePanel();
        setContentPane(p);
        p.setFocusable(true);
        p.requestFocus();

        setSize(400,400);
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClipAndKey :: new);
    }
}
