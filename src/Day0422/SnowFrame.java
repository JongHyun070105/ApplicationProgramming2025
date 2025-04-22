package Day0422;

import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Vector;

public class SnowFrame extends JFrame {
    public SnowFrame(){
        setTitle("눈 내리는 마을");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new SnowPanel());
        setResizable(false);
        setSize(300,300);
        setVisible(true);
    }

    class SnowPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("img/back.jpg");
        private Image img = icon.getImage();
        private final int SNOWS = 100;
        private final int SNOW_SIZE = 10;
        private Vector<Point> snowVector = new Vector<>();
        public SnowPanel(){
            this.addComponentListener(new ComponentAdapter() {
                public void componentResized(ComponentEvent e){
                    addSnow();
                    new SnowThread().start();
                    SnowPanel.this.removeComponentListener(this);
                }
            });
        }

        public void addSnow(){
            for(int i = 0; i < SNOWS; i++){
                Point p = new Point((int)(Math.random() * getWidth()), (int)(Math.random() * getHeight()));
                snowVector.add(p);
            }
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            drawSnow(g);
        }
        private void drawSnow(Graphics g){
            Random rand = new Random();
            for(int i = 0; i < snowVector.size(); i++){
                Point p = snowVector.get(i);
                Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                g.setColor(randomColor);
                g.fillOval(p.x, p.y, SNOW_SIZE, SNOW_SIZE);
            }
        }

        class SnowThread extends Thread{
            public void run(){
                while(true){
                    try{
                        sleep(30);
                    }catch (InterruptedException e){
                        return;
                    }
                    changeSnowPosition();
                    SnowPanel.this.repaint();
                }
            }
        }
        private void changeSnowPosition(){
            for(int i = 0; i < SNOWS; i++){
                Point p = snowVector.get(i);
                int xDir = Math.random() > 0.5 ? 1 : -1;
                int offsetX = (int)((Math.random() * 3) * xDir);
                int offsetY = (int)(Math.random() * 7);

                p.x += offsetX;
                if(p.x < 0) p.x = 0;
                p.y += offsetY;
                if(p.y > getHeight()){
                    p.x = (int)(Math.random() * getWidth());
                    p.y = 5;
                }
            }
        }
    }
    public static void main(String[] args) {
        new SnowFrame();
    }
}
