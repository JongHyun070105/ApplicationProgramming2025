package Day0429;

import javax.swing.*;
import java.awt.*;

public class TabMenuEx extends JFrame {
    public TabMenuEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        JTabbedPane tp = createTabbedPane();
        cp.add(tp, BorderLayout.CENTER);

        setSize(500,500);
        setVisible(true);
    }

    private JTabbedPane createTabbedPane() {
        JTabbedPane tp = new JTabbedPane(JTabbedPane.LEFT);
        tp.addTab("tab1", new JLabel(new ImageIcon("img/image1.jpg")));
        tp.addTab("tab2", new JLabel(new ImageIcon("img/image2.jpg")));
        tp.addTab("tab3", new MyPanelTab());

        return tp;
    }
    class MyPanelTab extends JPanel{
        public MyPanelTab(){
            this.setBackground(Color.YELLOW);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillRect(10,10, 50, 50);
            g.setColor(Color.BLUE);
            g.fillOval(10,70,50,50);
            g.setFont(new Font("Gothic", Font.BOLD, 30));
            g.drawString("tab3에 들어가는 panel 입니다.", 70, 40);

        }
    }

    public static void main(String[] args) {
        new TabMenuEx();
    }
}
