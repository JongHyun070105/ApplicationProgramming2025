package Day0617;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello Day0624.Sever?");
        socket.close();
    }
}
