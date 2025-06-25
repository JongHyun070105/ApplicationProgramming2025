package Day0625;

import javax.swing.*;
import java.awt.*;

public class LayoutMangeEx extends JFrame {
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");

    public LayoutMangeEx(){
        setTitle("레이아웃 매니저");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout(20, 10));
        cp.add(b1, BorderLayout.CENTER);
        cp.add(b2,BorderLayout.EAST);
        cp.add(b3,BorderLayout.WEST);
        cp.add(b4,BorderLayout.NORTH);
        cp.add(b5,BorderLayout.SOUTH);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutMangeEx();
    }
}
