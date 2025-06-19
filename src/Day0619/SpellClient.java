package Day0619;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SpellClient extends JFrame {
    private JTextField wordTf = new JTextField(10);
    private JLabel resLabel = new JLabel("체크 결과 ");
    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;

    public SpellClient(){
        setTitle("스펠링 체크 클라이언트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("영어 단어 입력하세요 >> "));
        cp.add(wordTf);
        cp.add(resLabel);

        setSize(300,150);
        setVisible(true);

        setupConnection();

        wordTf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField tf = (JTextField) e.getSource();
                try {
                    String word = tf.getText().trim();
                    if (word.length() == 0){
                        return;
                    }
                    out.write(word + '\n');
                    out.flush();

                    String result = in.readLine();
                    resLabel .setText(word + "는 " + result);
                } catch (IOException i){
                    i.printStackTrace();
                    return;
                }
            }
        });
    }

    private void setupConnection(){
        try{
            socket = new Socket("10.26.136.47", 9998);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SpellClient();
    }
}
