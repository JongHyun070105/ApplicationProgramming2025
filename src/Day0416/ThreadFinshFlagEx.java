package Day0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class RandomThread extends Thread {
    private Container contentPane;
    private boolean flag = false;

    public RandomThread(Container contentPane) {
        this.contentPane = contentPane;
    }

    void finish() {
        flag = true;
    }

    @Override
    public void run() {
        while (true) {
            int randx = (int)(Math.random() * contentPane.getWidth());
            int randy = (int)(Math.random() * contentPane.getHeight());

            JLabel l = new JLabel("java");

            l.setSize(80,30);
            l.setLocation(randx,randy);

            contentPane.add(l);
            contentPane.repaint();

            try{
                Thread.sleep(400);
                if(flag){
                    contentPane.removeAll();
                    l = new JLabel("finish");
                    l.setSize(80,30);
                    l.setLocation(100,100);
                    l.setForeground(Color.RED);
                    contentPane.add(l);
                    return;
                }
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class ThreadFinshFlagEx extends JFrame {
    private RandomThread th;
    public ThreadFinshFlagEx() {
        setTitle("스레드 종료 플래그");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                th.finish();
            }
        });

        setSize(400,400);
        setVisible(true);

        th = new RandomThread(c);
        th.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ThreadFinshFlagEx :: new);
    }
}
