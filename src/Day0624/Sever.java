package Day0624;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException { // 예외 처리
        // 서버소켓
        // 서버소켓임을 알려줌
        // 클라이언트 신호 대기
        // 클라이언트 신호 확인
        // 클라이언트 신호 받았다고 메시지 출력
        // 클라이언트 신호 끊기

        // 서버소켓 생성
        ServerSocket sever = new ServerSocket(8888);

        // 서버 소켓임을 알려줌
        System.out.println("서버 시작됨...");

        // 신호 대기
        Socket client = sever.accept();

        // 신호 확인
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String line = in.readLine();

        // 신호 받았다고 메시지 출력
        System.out.println("수신 : " + line);

        // 신호 끊기
        client.close();
        sever.close();
    }
}
