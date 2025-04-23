package Day0423;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame {
    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx(){
        setTitle("MenuAction Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);

        setSize(400,400);
        setVisible(true);
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenuItem[] menuItems = new JMenuItem[4];
        String[] itemsTitle = {"Load","Hide","ReShow","Exit"};
        JMenu screenMenu = new JMenu("Screen");

        MenuActionListener listener = new MenuActionListener();
        for(int i = 0; i < menuItems.length; i++){
            menuItems[i] = new JMenuItem(itemsTitle[i]);
            menuItems[i].addActionListener(listener);
            screenMenu.add(menuItems[i]);
        }
        menuBar.add(screenMenu);

        menuBar.add(new JMenu("Edit"));
        menuBar.add(new JMenu("Source"));
        menuBar.add(new JMenu("Project"));
        menuBar.add(new JMenu("Run"));

        setJMenuBar(menuBar);
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) {
                case "Load":
                    if(imgLabel.getIcon() != null){
                        return;
                    }else {
                        imgLabel.setIcon(new ImageIcon("img/img.png"));
                        break;
                    }
                case "Hide" :
                    imgLabel.setVisible(false);
                    break;
                case "ReShow":
                    imgLabel.setVisible(true);
                    break;
                case "Exit" :
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MenuActionEventEx();
    }
}
