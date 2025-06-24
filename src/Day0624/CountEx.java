package Day0624;

import javax.swing.*;
import java.awt.*;

public class CountEx extends JFrame {
    public CountEx(){
        setTitle("스레드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        JLabel la = new JLabel("카운트 : 0"); // label 추가
        cp.add(la);

        ThreadClass tc = new ThreadClass(la); // 스레드 클래스 선언
        tc.start(); // 스레드 시작

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountEx();
    }
}

class ThreadClass extends Thread{
    JLabel la; // 라벨 가져오고
    int count = 0; // 카운트에 필요한 정수 선언
    public ThreadClass(JLabel la){ // 생성자에 업데이트할 라벨 가져오기
        this.la = la;
    }

    @Override
    public void run() {
        while (true) {
            try {
                la.setText("카운트 : " + count); // 라벨 업데이트하기
                count++; // 카운트 증가
                Thread.sleep(1000); // 1초 쉬기
                }catch (Exception e){ // 예외처리
                e.printStackTrace();
            }
        }
    }
}
