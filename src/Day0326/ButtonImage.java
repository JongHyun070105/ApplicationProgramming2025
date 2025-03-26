package Day0326;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonImage extends JFrame {
    public ButtonImage() {
        setTitle("버튼으로 이미지 보이기 / 감추기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(400,400);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("img/back.jpg");
        private Image img =  icon.getImage();
        private JButton button = new JButton("이미지 보이기 / 감추기");
        private boolean showflag = true;

        public MyPanel(){
            setLayout(new FlowLayout());
            add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showflag = !showflag;
                    MyPanel.this.repaint();
                }
            });
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(showflag){  // true 라면 그리고, false라면 그림을 감춤
                g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonImage::new);
    }
}
