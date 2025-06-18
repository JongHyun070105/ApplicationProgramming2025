package Day0618;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonEventEx extends JFrame {
    JButton btn = new JButton("클릭하세요");

    public ButtonEventEx(){
        setTitle("이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        cp.add(btn);
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "클릭됨!");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setText("마우스 오버!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setText("클릭하세요");
            }
        });

        setSize(500,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEventEx();
    }
}