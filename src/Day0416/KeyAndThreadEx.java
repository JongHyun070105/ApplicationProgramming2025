package Day0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class MyLabel extends JLabel {
    int barSize = 0;
    int maxBarSize;

    MyLabel(int maxBarSize){
        this.maxBarSize = maxBarSize;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        int width = (int)(((double)(this.getWidth())) / maxBarSize * barSize);
        if(width == 0){
            return;
        }
        g.fillRect(0, 0, width, this.getHeight());
    }
    synchronized void fill(){
        if(barSize == maxBarSize){
            try{
                wait();
            }catch(InterruptedException e){
                return;
            }
        }
            barSize++;
            repaint();
            notify();
        }
    synchronized void consume(){
        if(barSize == 0){
            try{
                wait();
            }catch(InterruptedException e){
                return;
            }
        }
        barSize--;
        repaint();
        notify();
    }
}

class ConsumerThread extends Thread{
    MyLabel bar;
    public ConsumerThread(MyLabel bar){
        this.bar = bar;
    }
    public void run(){
        while(true){
            try{
                sleep(2000);
                bar.consume();
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class KeyAndThreadEx extends JFrame {
    MyLabel bar = new MyLabel(100);
    public KeyAndThreadEx(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(null);

        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setSize(300,20);
        bar.setLocation(20,50);

        cp.add(bar);

        cp.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                bar.fill();
            }
        });
        setSize(400,400);
        setVisible(true);


        cp.requestFocus();
        ConsumerThread th = new ConsumerThread(bar);
        th.start();
    }

    public static void main(String[] args) {
        new KeyAndThreadEx("빨리 누르기");
    }
}
