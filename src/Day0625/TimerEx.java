package Day0625;

import javax.swing.*;
import java.awt.*;

public class TimerEx extends JFrame {
    JLabel la = new JLabel("타이머 : 0");
    public TimerEx(){
        setTitle("타이머 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(la);

        TimerThread tt = new TimerThread(la);

        setSize(300,300);
        setVisible(true);

        tt.start();
    }

    public static void main(String[] args) {
        new TimerEx();
    }
}

class TimerThread extends Thread{
    JLabel la;
    int time = 0;
    public TimerThread(JLabel la){
        this.la = la;
    }

    @Override
    public void run() {
        while (true){
            try {
                la.setText("타이머 : " + time);
                time++;
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
