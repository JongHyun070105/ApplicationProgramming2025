package Day0417;

import org.intellij.lang.annotations.Flow;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

class MyLabel extends JLabel implements Runnable{
    private Thread timerThread = null;
    public MyLabel(){
        setText(makeClockText());
        setFont(new Font("DoHyeon", Font.ITALIC, 50));
        setHorizontalAlignment(JLabel.CENTER);
        timerThread = new Thread(MyLabel.this);
        timerThread.start();
    }

    private String makeClockText(){
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        String clockText = Integer.toString(hour);
        clockText += " : ";
        clockText += Integer.toString(minute);
        clockText += " : ";
        clockText += Integer.toString(second);
        return clockText;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
            setText(makeClockText());
        }
    }
}
public class DigitalClockFrame extends JFrame{
    public DigitalClockFrame() {
        setTitle("디지털 시계 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new MyLabel());

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalClockFrame();
    }
}
