package Day0424;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyDialog extends JDialog{
    JTextField tf = new JTextField(10);
    JButton btn = new JButton("OK");
    public MyDialog(JFrame frame, String title){
        super(frame,title);
        setLayout(new FlowLayout());

        add(tf);
        add(btn);

        setSize(200, 200);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}

public class DialogEx extends JFrame {
    MyDialog dialog;
    public DialogEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        JButton btn = new JButton("Show Dialog");

        dialog = new MyDialog(this, "Dialog Name");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        cp.add(btn);


        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogEx();
    }
}
