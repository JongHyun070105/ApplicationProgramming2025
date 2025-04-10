package Day0410;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class Exam04 {
    // HashMap<K,V>
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> nara = new HashMap<>();

        System.out.println("나라 이름과 인구를 입력하세요 (그만 을 입력하면 검색으로)");
        while(true) { // 입력
            String input = scan.nextLine();
            if(input.equals("그만")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            String[] words = input.split(" ");
            nara.put(words[0], Integer.parseInt(words[1]));
        }
        // 탐색
        while(true){
            System.out.print("인구 검색 (나라 입력) >> ");
            String input = scan.nextLine();
            if(input.equals("그만")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            // 나라 이름을 검색, 결과가 있는지 확인
            // 있으면 인구 출력
            // 없으면 나라가 없다는 메시지 출력
            if(nara.containsKey(input)){
                System.out.println(input + "의 인구는 " + nara.get(input));
            }else{
                System.out.println(input + "나라는 없습니다.");
            }
        }
        scan.close();
    }
}
