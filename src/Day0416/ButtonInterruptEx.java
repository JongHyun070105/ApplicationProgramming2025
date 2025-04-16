package Day0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimerRunnable implements Runnable {
    private JLabel label;
    public TimerRunnable(JLabel label) {
        this.label = label;
    }
    @Override
    public void run() {
        int n = 0;

        while (true) {
            label.setText(String.valueOf(++n));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}
public class ButtonInterruptEx extends JFrame {
    private Thread th;
    public ButtonInterruptEx() {
        setTitle("버튼 스레드 인터럽트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable timerRunnable = new TimerRunnable(timerLabel);
        th = new Thread(timerRunnable);

        cp.add(timerLabel);

        // 중단 버튼
        JButton btn = new JButton("Stop Timer");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                th.interrupt();
                btn.setEnabled(false);
            }
        });

        cp.add(btn);

        setSize(300, 300);
        setVisible(true);

        th.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonInterruptEx::new);
    }
}
