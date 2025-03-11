package Day0311;

import javax.swing.*;
import java.awt.*;

public class JComboBoxEx extends JFrame {
    public JComboBoxEx() {
        String[] fruits = {"apple","pear","mango","banana","lemon","kiwi","strawberry","cherry","peach"};
        String[] names = {"강보성","고현민","권지원","김민준","김장호"};

        setTitle("콤보박스 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JComboBox<String> nameCombo = new JComboBox<>(names);
        JComboBox<String> fruitCombo = new JComboBox<>(fruits);

        cp.add(nameCombo);
        cp.add(fruitCombo);

        JComboBox<String> strCombo = new JComboBox<>();
        // 빈 콤보 박스에 반복문을 통해서 콤보 박스 채우기
        for(int i=0;i<names.length;i++){
            strCombo.addItem(names[i]);

        }

        cp.add(strCombo);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JComboBoxEx());
    }
}
