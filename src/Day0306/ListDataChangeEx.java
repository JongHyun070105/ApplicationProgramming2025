package Day0306;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ListDataChangeEx extends JFrame {

    JTextField tf = new JTextField(10);
    Vector <String> v = new Vector<String>();
    JList <String> nameList = new JList<String>(v);

    public ListDataChangeEx() {
        setTitle("리스트 데이터 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("이름을 입력 후 <Enter> 키를 누르세요"));
        cp.add(tf);

        v.add("김현우");
        v.add("문현중");
        v.add("허정혁");

        nameList.setVisibleRowCount(5);
        nameList.setFixedCellHeight(50);
        nameList.setFixedCellWidth(50);

        cp.add(new JScrollPane(nameList));

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t =  (JTextField)e.getSource();
                v.add(t.getText());
                t.setText("");
                nameList.setListData(v);
            }
        });

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListDataChangeEx());
    }

}
