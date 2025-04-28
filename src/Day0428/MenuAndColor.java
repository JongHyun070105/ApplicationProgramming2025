package Day0428;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAndColor extends JFrame {
    JLabel label = new JLabel("Hello World!");
    public MenuAndColor(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Ravie", Font.ITALIC, 30));

        cp.add(label, BorderLayout.CENTER);
        createMenu();

        setSize(500,500);
        setVisible(true);
    }

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("Text");
        JMenuItem colorItem = new JMenuItem("Color");
        colorItem.addActionListener(new MyActionListener());
        fileMenu.add(colorItem);
        mb.add(fileMenu);
        this.setJMenuBar(mb);
    }

    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if(cmd.equals("Color")){
                Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
                if(selectedColor != null){
                    label.setForeground(selectedColor);
                }
            }
        }
    }


    public static void main(String[] args) {
        new MenuAndColor();
    }
}
