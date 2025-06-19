package Day0619;

import javax.swing.*;
import java.awt.*;

class TimerThread extends Thread{
    JLabel la;
    int count = 0;

    public TimerThread(JLabel la){
        this.la = la;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                count++;
                la.setText("카운트 : " + count);
            } catch (Exception e){
                return;
            }
        }
    }
}

public class Count extends JFrame{
    public Count(){
        setTitle("카운트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel timerCountLabel = new JLabel("카운트 : 0");

        cp.add(timerCountLabel);

        TimerThread tt = new TimerThread(timerCountLabel);
        tt.start();

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Count();
    }
}