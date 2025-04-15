package Day0415;

import javax.swing.*;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable{
    private long delay;
    public FlickeringLabel(String text, long delay){
        super(text);
        this.delay = delay;
        setOpaque(true);
        Thread th = new Thread(this);
        th.start();
    }
    public void run(){
        int n = 0;
        while(true){
            if(n == 0){
                setBackground(Color.YELLOW);
            }else{
                setBackground(Color.GREEN);
            }

            if(n == 0) {
                n = 1;
            } else{
                n = 0;
            }
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx(){
        setTitle("깜박이는 글자");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 깜박이는 레이블
        FlickeringLabel fl1 = new FlickeringLabel("깜박", 500);

        // 깜박이지 않은 레이블
        JLabel la = new JLabel("깜박이지 않아요");

        // 깜박이는 레이블
        FlickeringLabel fl2 = new FlickeringLabel("까궁",800);

        cp.add(fl1);
        cp.add(la);
        cp.add(fl2);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}
