package Day0624;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test1 extends JFrame {
    JButton jb = new JButton("클릭");
    public Test1(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(jb);
        jb.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "클릭!");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jb.setText("호버됨");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jb.setText("클릭");
            }
        });

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test1();
    }
}
