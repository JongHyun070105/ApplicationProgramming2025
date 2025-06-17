package Day0617;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket socket = null;
        Scanner scan = new Scanner(System.in);

        try{
            socket = new Socket("localhost", 9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while(true){
                System.out.println("보내기 >> ");
                String outputMessage = scan.nextLine();
                if (outputMessage.equalsIgnoreCase("bye")){
                    out.write(outputMessage + "\n");
                    out.flush();
                    break;
                }
                out.write(outputMessage + "\n");
                out.flush();
                String inputMessage = in.readLine();
                System.out.println("서버: " + inputMessage);
            }
        } catch (IOException e){
            e.getMessage();
        } finally {
            try{
                scan.close();
                if(socket != null){
                    socket.close();
                }
            } catch (IOException e){
                System.out.println("에러발생");
            }
        }
    }
}
