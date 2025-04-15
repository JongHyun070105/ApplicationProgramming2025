package Day0415;

import javax.swing.*;
import java.awt.*;

class ThreadTimerEx extends Thread{
    private JLabel timerLable;
    public ThreadTimerEx(JLabel timerLable){
        this.timerLable = timerLable;
    }
    public void run(){
        int n = 0;
        while(true){
            timerLable.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class ThreadTimer extends JFrame {
    public ThreadTimer(){
        setTitle("스레드를 상속받은 타이머 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel label = new JLabel();

        label.setFont(new Font("Gothic", Font.ITALIC, 80));
        cp.add(label);

        ThreadTimerEx th = new ThreadTimerEx(label);

        setSize(300,300);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(ThreadTimer::new);
    }
}