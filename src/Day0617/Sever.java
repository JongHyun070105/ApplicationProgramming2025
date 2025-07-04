package Day0617;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sever{
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;
        Scanner scan = new Scanner(System.in);

        try{
            listener = new ServerSocket(9999);
            System.out.println("연결을 기다리고 있습니다...");
            socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
            System.out.println("연결 완료");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true){
                String inputMessage = in.readLine();
                if(inputMessage.equalsIgnoreCase("bye")){
                    System.out.println("클라이언트에서 bye로 연결을 끝냈음");
                    break;
                }
                System.out.println("클라이언트: " + inputMessage);
                System.out.print("보내기 >> ");
                String outputMessage = scan.nextLine();
                out.write(outputMessage + "\n");
                out.flush();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                scan.close();
                socket.close();
                listener.close();
            } catch (IOException e){
                System.out.println("클라이언트와 채팅 중 에러가 발생");
            }
        }
    }
}
