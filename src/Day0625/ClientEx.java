package Day0625;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) throws Exception {
        // 서버 접속
        Socket socket = new Socket("localhost", 9999);

        // 서버에 전송
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

        // 전송할 내용
        pw.println("안녕");

        // 종료
        socket.close();
        pw.close();
    }
}
