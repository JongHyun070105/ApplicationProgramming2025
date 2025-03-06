package Day0306;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    String[] fruits = {"apple", "orange", "banana", "kiwi", "mango", "pear", "strawberry", "peach", "pineapple", "grape"};
    ImageIcon[] img = {new ImageIcon("img/icon1.png"),
                       new ImageIcon("img/icon2.png"),
                       new ImageIcon("img/icon3.png"),
                       new ImageIcon("img/icon4.png")};

    public ListEx() {
        setTitle("리스트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JList<String> strList = new JList<>(fruits);
        cp.add(strList);

        JList<ImageIcon> imgList = new JList<ImageIcon>(img);
        imgList.setListData(img);
        cp.add(imgList);

        JList<String> scrollList = new JList<String>(fruits);
        cp.add(new JScrollPane(scrollList));

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListEx());
    }

}
