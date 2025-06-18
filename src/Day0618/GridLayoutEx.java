package Day0618;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,3,10 ,10));

        cp.add(new JButton("1"));
        cp.add(new JButton("2"));
        cp.add(new JButton("3"));
        cp.add(new JButton("4"));
        cp.add(new JButton("5"));
        cp.add(new JButton("6"));
        cp.add(new JButton("7"));
        cp.add(new JButton("8"));
        cp.add(new JButton("9"));
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}