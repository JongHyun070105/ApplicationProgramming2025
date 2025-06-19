package Day0619;

import javax.swing.*;
import java.awt.*;

public class Count extends JFrame implements Runnable {
    private JLabel label;
    private int secondsCounter = 0;
    public Count() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("카운터");
        setLayout(new BorderLayout());

        label = new JLabel("카운트 : " + secondsCounter);
        add(label);

        setSize(300, 200);

        Thread counterThread = new Thread(this);
        counterThread.start();

        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                secondsCounter++;

                SwingUtilities.invokeLater(() -> label.setText("카운트 : "+secondsCounter));

            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Count();
    }
}