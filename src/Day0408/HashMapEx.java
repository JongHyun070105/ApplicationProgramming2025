package Day0408;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();
        // 키 : 벨류 딕셔너리랑 똑같음
        dic.put("baby","아기");
        dic.put("rose","장미");
        dic.put("apple","사과");
        dic.put("java","자바");

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("찾고 싶은 단어는? ");
            String eng = scan.next();
            if(eng.equals("exit")){
                System.out.println("종료");
                break;
            }
            String kor = dic.get(eng);
            if(kor == null){
                System.out.println(eng + " 없는 단어입니다.");
            }
            else{
                System.out.println(kor);
            }
            scan.close();
        }
    }
}
