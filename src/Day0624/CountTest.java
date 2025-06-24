package Day0624;

import javax.swing.*;
import java.awt.*;

public class CountTest extends JFrame {
    JLabel la = new JLabel("타이머 : 0");
    public CountTest(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(la);

        la.setFont(new Font("Gothic", Font.BOLD, 50));

        ThreadEx te = new ThreadEx(la);
        te.start();

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountTest();
    }
}

class ThreadEx extends Thread{
    JLabel la;
    int count = 0;
    public ThreadEx(JLabel la){
        this.la = la;
    }

    @Override
    public void run() {
        while (true){
            try{
                la.setText("카운트 : " + count);
                count++;
                Thread.sleep(1000);
            }catch (Exception e){
                return;
            }
        }
    }
}
