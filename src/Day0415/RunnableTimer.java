package Day0415;

import javax.swing.*;
import java.awt.*;

class TimerRunnable implements Runnable{
    private JLabel timerLabel;
    public TimerRunnable(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
    }
}

public class RunnableTimer extends JFrame {
    public RunnableTimer(){
        setTitle("러너블 인터페이스 스레드 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Gothic",Font.BOLD,80));
        cp.add(label);

        TimerRunnable th = new TimerRunnable(label);
        Thread t = new Thread(th);

        setSize(300,300);
        setVisible(true);

        t.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(RunnableTimer::new);
    }
}
