package Day0417;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class GamePanel extends JPanel{
    private TargetThread targetThread = null;
    private JLabel baseLabel = new JLabel();
    private JLabel bulletLabel = new JLabel();
    private JLabel targetLabel = new JLabel();

    public GamePanel(){
        setLayout(null);
        baseLabel.setSize(40,40);
        baseLabel.setOpaque(true);
        baseLabel.setBackground(Color.BLACK);

        ImageIcon img = new ImageIcon("img/chicken.png");
        targetLabel = new JLabel(img);
        targetLabel.setSize(img.getIconWidth(),img.getIconHeight());

        bulletLabel.setSize(10,10);
        bulletLabel.setOpaque(true);
        bulletLabel.setBackground(Color.RED);

        add(baseLabel);
        add(targetLabel);
        add(bulletLabel);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                baseLabel.setFocusable(true);
                baseLabel.requestFocus();
            }
        });
    }
    public void startGame(){
        baseLabel.setLocation(this.getWidth() / 2 - 20, this.getHeight() / 2 - 40);
        bulletLabel.setLocation(this.getWidth() / 2 - 5, this.getHeight() - 50);
        targetLabel.setLocation(0, 0);

        targetThread = new TargetThread(targetLabel);
        targetThread.start();

        // GamePanel에 포커스 설정
        setFocusable(true);
        requestFocusInWindow(); // 이 부분을 통해 GamePanel이 키 입력을 받을 수 있도록 설정

        addKeyListener(new KeyAdapter() {
            BulletThread bulletThread = null;
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyChar() == '\n'){
                    // 총알이 이미 발사 중이 아니면 새로운 BulletThread를 시작
                    if(bulletThread == null || !bulletThread.isAlive()){
                        bulletThread = new BulletThread(targetLabel, bulletLabel, targetThread);
                        bulletThread.start();
                    }
                }
            }
        });
    }

    class BulletThread extends Thread{
        private JComponent target, bullet;
        private Thread targetThread;
        public BulletThread(JComponent target, JComponent bullet, Thread targetThread) {
            this.bullet = bullet;
            this.target = target;
            this.targetThread = targetThread;
        }
        @Override
        public void run(){
            while(true){
                if(hit()){
                    targetThread.interrupt();
                    bullet.setLocation(bullet.getParent().getWidth() / 2 -5, bullet.getParent().getHeight() - 50);
                    return;
                }else{
                    int x = bullet.getX();
                    int y = bullet.getY();
                    y -= 5; // 총알을 위로 이동시킴
                    if(y < 0){
                        bullet.setLocation(bullet.getParent().getWidth() / 2 -5, bullet.getParent().getHeight() - 50 );
                        bullet.getParent().repaint();
                        return;
                    }
                    bullet.setLocation(x,y);
                    bullet.getParent().repaint();
                }
                try{
                    sleep(20);
                }catch (InterruptedException e){
                    return;
                }
            }
        }
        public boolean hit(){
            if (targetContains(bullet.getX(), bullet.getY()) ||
                targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY()) ||
                targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1) ||
                targetContains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1)) {
                return true;
            } else {
                return false;
            }
        }
        public boolean targetContains(int x, int y){
            if(((target.getX() <= x) && (target.getX() + target.getWidth() - 1 >= x)) &&
                    ((target.getY() <= y) && target.getY() + bullet.getWidth() - 1 >= y)){
                return  true;
            }else{
                return false;
            }
        }
    }
}
class TargetThread extends Thread{
    private JComponent target;
    public TargetThread(JComponent target){
        this.target = target;
        target.setLocation(0,0);
        target.getParent().repaint();
    }

    @Override
    public void run(){
        while(true){
            int x = target.getX() + 5;
            int y = target.getY();

            if(x > target.getParent().getWidth()){
                target.setLocation(0,0);
            }else{
                target.setLocation(x, y);
            }
            target.getParent().repaint();

            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                target.setLocation(0,0);
                target.getParent().repaint();
                try{
                    sleep(500);
                }catch (InterruptedException ex){
                    return;
                }
            }
        }
    }
}



public class BulletGameFrame extends JFrame{
        public BulletGameFrame(){
            setTitle("");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GamePanel gamePanel = new GamePanel();
            setContentPane(gamePanel);
            setSize(300,300);
            setVisible(true);
            gamePanel.startGame();
        }

    public static void main(String[] args) {
        new BulletGameFrame();
    }
}
