package Day0424;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyModalDialog extends JDialog{
    JTextField tf = new JTextField(10);
    JButton btn = new JButton("Ok");

    public MyModalDialog(JFrame frame, String title){
        super(frame, title);
        setLayout(new FlowLayout());
        add(tf);
        add(btn);
        setSize(200,100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public String getInput(){
        if (tf.getText().length() == 0){
            return null;
        }else {
            return tf.getText();
        }
    }
}

public class DialogEx2 extends JFrame {
    MyModalDialog dialog;
    public DialogEx2(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Show Modal Dialog");
        dialog = new MyModalDialog(this, "I'm Modal");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);

                String text = dialog.getInput();
                if(text == null){
                    return;
                }else{
                    JButton btn = (JButton)e.getSource();
                    btn.setText(text);
                }
            }
        });

        getContentPane().add(btn);


        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogEx2();
    }
}
