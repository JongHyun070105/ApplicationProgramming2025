package Day0304;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComponentEX extends JFrame {
    public JComponentEX() {
        setTitle("첫번째 과제");
        Container cp = getContentPane(); // 내용물을 담을 컨테이너 생성
        cp.setLayout(new FlowLayout()); // FlowLayout 왼쪽부터 오른쪽으로 차례대로 배치

        // 버튼 생성
        JButton b1 = new JButton("Magenta / Yellow");
        JButton b2 = new JButton("Disabled Button");
        JButton b3 = new JButton("getX() getY()");

        // 컨테이너에 버튼 추가
        cp.add(b1);
        cp.add(b2);
        cp.add(b3);

        // 버튼 b1 설정
        b1.setBackground(Color.YELLOW); // 버튼 b1 배경색 노란색 설정
        b1.setForeground(Color.MAGENTA); // 버튼 b1 글씨색 보라색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // 버튼 b1 폰트 설정 (폰트명, 폰트 디자인, 폰트 사이즈)
        b1.setOpaque(true);
        b1.setBorderPainted(false);


        // 버튼 b2 설정
        b2.setEnabled(false); // false = 터치 불가능, true = 터치 가능

        // 버튼 b3 설정
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComponentEX frame = (JComponentEX) b3.getTopLevelAncestor();
                frame.setTitle(b3.getX() + " , " + b3.getY());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JComponentEX();
            }
        });
    }
}
