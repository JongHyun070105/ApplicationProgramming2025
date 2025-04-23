package Day0423;

import javax.swing.*;

public class MenuEx extends JFrame {
    public MenuEx(){
        setTitle("메뉴 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenu();

        setSize(400,400);
        setVisible(true);
    }

    private void createMenu(){
        JMenuBar mb = new JMenuBar();

//      mb.add(new JMenu("Screen"));
        JMenu screenMenu = new JMenu("Screen");
        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("ReShow"));
        screenMenu.addSeparator();
        screenMenu.add(new JMenuItem("Exit"));

        mb.add(screenMenu);

        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Source"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
