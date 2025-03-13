package Day0313;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JTextAreaInput extends JFrame {
    public JTextAreaInput(){
        JTextArea ta = new JTextArea(5,10);
        JSlider slider = new JSlider(0,100,50);
        setTitle("텍스트 영역 입력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JScrollPane(ta), BorderLayout.NORTH);
        cp.add(slider,  BorderLayout.CENTER);

        // 슬라이더 속성
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
//                if(ta.getText().length()<= slider.getValue()){
//                    slider.setValue(ta.getText().length());
//                }else{
                try {
                    ta.setText(ta.getText(0, slider.getValue()));
                } catch (BadLocationException e1) {
                    e1.printStackTrace();
                }
            }
        });

        ta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int size = ta.getText().length();
                try{
                    if(size >= 100){
                        ta.setText(ta.getText(0, 100));
                    }
                } catch (BadLocationException e2) {
                    e2.printStackTrace();
                }
                slider.setValue(size);
            }
        });
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTextAreaInput::new);
    }
}
