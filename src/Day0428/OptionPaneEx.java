package Day0428;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame {
    public OptionPaneEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(new MyPanel(), BorderLayout.NORTH);

        setSize(500,500);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        JButton input = new JButton("이름 입력");
        JButton confirm = new JButton("Confirm");
        JButton message = new JButton("Message");
        JTextField tf = new JTextField(10);
        public MyPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(input);
            add(confirm);
            add(message);
            add(tf);

            input.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("이름을 입력해주세요");
                    if(name != null){
                        tf.setText(name);
                    }
                }
            });

            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(null,"계속하겠습니까?","Confirm", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        tf.setText("Yes");
                    } else if(result == JOptionPane.NO_OPTION) {
                        tf.setText("No");
                    } else{
                        tf.setText("Just Closed without Selection");
                    }
                }
            });

            message.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"조심하세요","Message",JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static void main(String[] args) {
        new OptionPaneEx();
    }
}
