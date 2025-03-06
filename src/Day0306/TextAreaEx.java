package Day0306;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {

    JTextArea ta = new JTextArea(20,40);
    JTextField tf = new JTextField(10);

    public TextAreaEx() {
        setTitle("텍스트 영역 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("글자를 입력 후 <Enter> 키를 눌러주세요"));
        cp.add(tf);
        cp.add(new JScrollPane(ta));
        // 스크롤

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                ta.append(t.getText() + "\n");
                t.setText("");
            }
        });

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextAreaEx());
    }
}
