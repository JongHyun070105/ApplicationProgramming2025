package Day0417;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CirclePanel extends JPanel implements Runnable{
    private int x = 100;
    private int y = 100;

    public CirclePanel(){
        this.addMouseListener(new MouseAdapter(){
            private Thread th = null;

            @Override
            public void mousePressed(MouseEvent e){
                if(th == null){
                    th = new Thread(CirclePanel.this);
                    th.start();
                }
            }
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawOval(x,y,50,50);
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(500); // 0.5초 단위로 원 생성
            }catch (InterruptedException e){
                return;
            }
            x = (int)(Math.random()*this.getWidth());
            y = (int)(Math.random()*this.getHeight());
            repaint();
        }
    }
}

public class RandomCircleFrame extends JFrame {
    public RandomCircleFrame(){
        setTitle("원을 0.5초 간격으로 랜덤한 위치로 이등시키는 스레드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new CirclePanel());
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RandomCircleFrame();
    }
}
