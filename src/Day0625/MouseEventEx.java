package Day0625;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx extends JFrame {
    JButton btn = new JButton("클릭");
    public MouseEventEx(){
        setTitle("마우스 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(btn);

        btn.addMouseListener(new MouseListener() {
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
                btn.setText("호버");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setText("클릭");
            }
        });

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventEx();
    }
}
