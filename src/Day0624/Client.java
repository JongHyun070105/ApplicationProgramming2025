package Day0624;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException { // 예외 처리
        // 클라이언트 소켓 선언
        // 서버에 클라이언트 신호 전송
        // 클라이언트 신호 해제

        // 클라이언트 소켓 선언
        Socket client = new Socket("localhost",8888); // 127.0.0.1

        // 서버에 클라이언트 신호 전송
        PrintWriter out = new PrintWriter(client.getOutputStream(), true); // Flush => 자료 전송
        out.println("안녕하세요? 서버님");

        // 신호 해제
        client.close();
    }
}
