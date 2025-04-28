package Day0428;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Filter;

public class MenuAndFile extends JFrame {
    JLabel imgLabel = new JLabel();
    public MenuAndFile(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.add(imgLabel);
        createMenu();

        setSize(500,500);
        setVisible(true);
    }

    public void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new MyActionListener2());
        fileMenu.add(openItem);
        mb.add(fileMenu);
        setJMenuBar(mb);
    }

    class MyActionListener2 implements ActionListener{
        JFileChooser chooser = new JFileChooser();
        public void actionPerformed(ActionEvent e){
            chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg","gif");
            chooser.setFileFilter(filter);
            int ret = chooser.showOpenDialog(null);
            if(ret != JFileChooser.APPROVE_OPTION){
                JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
                return;
            }
            String filepath = chooser.getSelectedFile().getPath();
            imgLabel.setIcon(new ImageIcon(filepath));
            pack();
        }
    }




    public static void main(String[] args) {
        new MenuAndFile();
    }
}
