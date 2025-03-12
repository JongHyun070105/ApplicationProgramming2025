package Day0312;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyChange extends JFrame {
    public MoneyChange(){
        setTitle("환전");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500,500);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public MyPanel(){
            int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
            String[] name = {"오만원","만원","오천원","천원","오백원","백원","오십원","십원","일원"};
            JTextField source;
            JTextField[] tf = new JTextField[unit.length];

            setBackground(Color.YELLOW);
            setLayout(null);

            JLabel la = new JLabel("금액");
            la.setHorizontalAlignment(JLabel.RIGHT);
            la.setSize(50,20);
            la.setLocation(20,20);
            add(la);

            source = new JTextField(30);
            source.setHorizontalAlignment(JTextField.RIGHT);
            source.setSize(100,20);
            la.setLocation(100,30);
            add(source);

            // 계산 버튼
            JButton calc = new JButton("계산");
            calc.setSize(70,20);
            calc.setLocation(210,20);
            add(calc);

            for(int i=0;i<unit.length;i++){
                la = new JLabel(name[i]);
                la.setHorizontalAlignment(JLabel.RIGHT);
                la.setSize(50,20);
                la.setLocation(50,50+i*20);
                add(la);

                tf[i] = new JTextField(unit[i]);
                tf[i].setHorizontalAlignment(JTextField.CENTER);
                tf[i].setSize(100,20);
                tf[i].setLocation(120,50+i*20);
                add(tf[i]);
            }

            calc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    String str = source.getText();
                    if(str.length() == 0){
                        return;
                    }else {
                        int money = Integer.parseInt(str);
                        int res;
                        for(int i=0;i<unit.length;i++){
                            res = money/unit[i];
                            tf[i].setText(Integer.toString(res));
                            if(res>0){
                                money = money % unit[i];
                            }
                        }
                    }
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MoneyChange::new);
    }
}
