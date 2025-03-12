package Day0312;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImgGalleryEx extends JFrame {
    JLabel imgLabel;
    ImageIcon[] img = new ImageIcon[4];
    int currentId; // 현재 선택된 이미지 번호 [0~3]
    public ImgGalleryEx() {
        setTitle("이미지 갤러리");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        //이미지 파일 로딩
        for (int i = 0; i < img.length; i++)
            img[i] = new ImageIcon("img/image"+i+".jpg");

        currentId = 0; // 현재 선택된 아미지 번호
        imgLabel = new JLabel(img[currentId]); // 현재 선택된 이미지 출력

        cp.add(imgLabel, BorderLayout.NORTH);
        cp.add(new MenuPan(), BorderLayout.CENTER);

        setSize(300,500);
        setVisible(true);
    }

    class MenuPan extends JPanel {
        public MenuPan() {
            setBackground(Color.GRAY);
            ImageIcon left = new ImageIcon("img/left.png");
            ImageIcon right = new ImageIcon("img/right.png");

            JButton btn = new JButton(left);
            JButton btn1 = new JButton(right);

            add(btn);
            add(btn1);

            btn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                   currentId--; // 이미지 감소 -> 이전 이미지
                   currentId += img.length; // 음수가 될 수 있는걸 방지
                   currentId %= img.length; // 4가 넘는 것을 방지
                   imgLabel.setIcon(img[currentId]);
               }
            });

            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    currentId ++; // 이미지 증가 -> 다음 이미지
                    currentId += img.length; // 음수가 될 수 있는걸 방지
                    currentId %= img.length; // 4가 넘는 것을 방지
                    imgLabel.setIcon(img[currentId]);
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImgGalleryEx::new);
    }

}
