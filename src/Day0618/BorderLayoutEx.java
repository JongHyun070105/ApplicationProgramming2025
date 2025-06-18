package Day0618;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout(30, 20));

        JButton add = new JButton("add");
        JButton div = new JButton("div");
        JButton Calculate = new JButton("Calculate");
        JButton mul = new JButton("mul");
        JButton sub = new JButton("sub");

        cp.add(add,BorderLayout.NORTH);
        cp.add(div,BorderLayout.WEST);
        cp.add(Calculate,BorderLayout.CENTER);
        cp.add(mul, BorderLayout.EAST);
        cp.add(sub, BorderLayout.SOUTH);


        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}