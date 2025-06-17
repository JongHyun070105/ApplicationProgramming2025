package Day0617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverTest {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8888);
        System.out.println(sever.getLocalPort() + "서버 시작됨.. 클라이언트 대기중");
        Socket clinet = sever.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clinet.getInputStream()));
        String line = in.readLine();
        System.out.println("수신 : " + line);
        clinet.close();
        sever.close();
    }
}
