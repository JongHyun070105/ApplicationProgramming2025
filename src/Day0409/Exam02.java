package Day0409;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 불러오기
        ArrayList<Character> a = new ArrayList(); // ArrayList 생성

        System.out.println("6개의 학점을 빈칸으로 구분하여 입력하세요 : ");
        String input = sc.nextLine();
        String[] split = input.split(" ");
        for(int i = 0; i < split.length; i++){
            if(split[i].charAt(0) >= 'A' && split[i].charAt(0) <= 'F'){
                a.add(split[i].charAt(0));
            }
        }
        double sum = 0.0;
        for(Character c : a){
            switch (c){
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1.0;
                    break;
                case 'F':
                    sum += 0.0;
                    break;
            }
        }
        System.out.println("평균 >> " + (sum/a.size()));
    }
}
