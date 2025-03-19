package Day0318.src.main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField user;
    private JPasswordField pass;
    public LoginForm(){
        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3, 2));

        JLabel userLa = new JLabel("사용자명 : ");
        user = new JTextField(30);

        JLabel passLa = new JLabel("비밀번호 : ");
        pass = new JPasswordField();

        JButton login = new JButton("로그인");

        cp.add(userLa); cp.add(user);
        cp.add(passLa); cp.add(pass);
        cp.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userid = user.getText();
                String password = new String(pass.getPassword());
                if(userid.equals("admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(null, "로그인 성공");
                    new StudentFrame().setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "로그인 실패");
                }
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginForm::new);
    }
}
