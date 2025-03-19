package Day0319;

import javax.swing.*;
import java.awt.*;

public class PaintShape extends JFrame {
    private MyPanel panel = new MyPanel();
    public PaintShape() {
        setTitle("도형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());



        setSize(400,500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10,10,50,50);
            g.drawRect(50,50,50,50);
            g.setColor(Color.MAGENTA);
            g.drawRect(100,100,40,40);
            g.drawString("자바는 재밌다",100,170);
            g.setColor(Color.RED);
            g.drawString("잠에서 깨어나야한다",120,190);
            g.setColor(new Color(150,100,120));
            g.setFont(new Font("Arial",Font.BOLD,25));
            g.drawString("살려주세요",140,220);

            for(int i = 0; i <= 5; i++){
                g.setFont(new Font("Arial",Font.BOLD,i * 10));
                g.drawString("LOL",200, 230 + i * 50);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaintShape::new);
    }
}
