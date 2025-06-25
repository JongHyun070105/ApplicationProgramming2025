package Day0625;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverEx {
    public static void main(String[] args) throws Exception{ // 예외처리
        // 서버소켓 만들기
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("접속 대기중..");

        // 서버소켓에 접속 신호 대기
        Socket socket = serverSocket.accept();

        // 신호 확인
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();

        // 신호 받았다고 메시지 출력
        System.out.println("수신 >> " + line);

        serverSocket.close();
        socket.close();
        br.close();
    }
}
