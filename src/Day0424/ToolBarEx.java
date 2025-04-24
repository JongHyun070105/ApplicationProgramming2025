package Day0424;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
    Container cp = getContentPane();
    public ToolBarEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        createToolBar();

        setSize(700,400);
        setVisible(true);
    }

    private void createToolBar() {
        JToolBar toolBar = new JToolBar("ToolBar Menu");
        toolBar.setBackground(Color.LIGHT_GRAY);

        toolBar.add(new JButton("New"));
        toolBar.addSeparator();
        toolBar.add(new JButton(new ImageIcon("img/open.jpg")));
        toolBar.addSeparator();
        toolBar.add(new JButton(new ImageIcon("img/save.jpg")));
        toolBar.addSeparator();
        toolBar.add(new TextField("TextField"));
        toolBar.addSeparator();
        toolBar.add(new JButton("search"));

        JComboBox comboBox = new JComboBox();
        comboBox.setToolTipText("프로그래밍 언어를 선택하세요");

        comboBox.addItem("Java");
        comboBox.addItem("PHP");
        comboBox.addItem("C#");
        comboBox.addItem("C++");
        comboBox.addItem("Go");

        toolBar.add(comboBox);
        toolBar.setFloatable(false);

        JButton btn = new JButton("OPEN");
        btn.setToolTipText("File open");
        toolBar.add(btn);

        ToolTipManager manager = ToolTipManager.sharedInstance();
        manager.setInitialDelay(0);
        manager.setDismissDelay(5000);

        cp.add(toolBar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ToolBarEx();
    }
}
