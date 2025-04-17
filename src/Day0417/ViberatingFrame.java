package Day0417;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ViberatingThread extends Thread{
    private Component comp;
    public ViberatingThread(Component comp){
        this.comp = comp;
    }
    public void run(){
        Random random = new Random();
        int x = comp.getX();
        int y = comp.getY();

        while(true){
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){
                return;
            }
            int sign = (random.nextBoolean())? 1 : -1;
            int tmpX = x + random.nextInt(1000) * sign;
            sign = (random.nextBoolean())? 1: -1;
            int tmpY = y + random.nextInt(1000) * sign;

            comp.setLocation(tmpX,tmpY);
        }
    }
}

public class ViberatingFrame extends JFrame {
    public ViberatingFrame(){
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100,100);
        setSize(300,300);
        setVisible(true);
        ViberatingThread th = new ViberatingThread(this);
        th.start();
    }
    public static void main(String[] args) {
        new ViberatingFrame();
    }
}
