package Day0305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckEvent extends JFrame {

    JCheckBox[] fruits = new JCheckBox[3];
    String[] fruitNames = {"Apple","Pear","Cherry"};
    JLabel sumLa;

    public CheckEvent() {
        setTitle("체크박스 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("사과 : 1000원 | 배 : 2000원 | 체리 : 1500원"));

        MyItemListener listener = new MyItemListener(); // 리스너 생성

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(fruitNames[i]);
            fruits[i].setBorderPainted(true);
            cp.add(fruits[i]);
            // 선택되었는지 확인 -> 리스너 필요 => 리스너를 각각의 체크박스에 붙여야함
            fruits[i].addItemListener(listener);
        }
        sumLa = new JLabel("현재 금액은 0원입니다.");
        cp.add(sumLa);

        setSize(300,200);
        setVisible(true);
    }
    class MyItemListener implements ItemListener {
        int sum = 0; // 초기값
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) { // 상태값이 선택되었을때
                if(e.getItem() == fruits[0]){ // 선택값을 가져오고 그게 apple 이라면
                    sum = sum + 1000; // 초기값에 1000을 더함
                }else if(e.getItem() == fruits[1]){ // 그게 아니고 pear라면
                    sum = sum + 2000; // 초기값에 2000을 더함
                }else if(e.getItem() == fruits[2]){ // 그게 아니고 cherry 라면
                    sum = sum + 1500; // 초기값에 1500을 더함
                }
            } else { // 상태값이 선택 취소된다면
                if(e.getItem() == fruits[0]){ // apple이 취소된다면
                    sum -= 1000; // 기존 값에서 1000을 뺌
                }else if(e.getItem() == fruits[1]){ // pear가 취소된다면
                    sum -= 2000; // 기존 값에서 2000을 뺌
                } else if(e.getItem() == fruits[2]){ // cherry가 취소된다면
                    sum -= 1500; // 기존 값에서 1500을 뺌
                }
            }
            sumLa.setText("현재 금액은 " + sum + "원 입니다."); // 금액이 체크박스에서 선택된거에 따라 변함
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CheckEvent());
    }
}
