package license.Day0513;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("성 : ");
        String str1 = scan.next();
        System.out.println("이름 : ");
        String str2 = scan.next();
        System.out.println("안녕하세요? " + str1 + str2 + "씨.");
        System.out.println("주소 : ");
        String str3 = scan.nextLine();
        System.out.println("주소 " + str3);
        System.out.println("숫자를 입력 >> ");

        int w = scan.nextInt();
        int e = scan.nextInt();

        if (w > 0){
            System.out.println("양수");
        } else if (w < 0) {
            System.out.println("음수");
        } else{
            System.out.println("0");
        }

        if (e > 0){
            System.out.println("절댓값 " + e);
        } else if (e < 0) {
            System.out.println("절댓값 " + -e );
        } else{
            System.out.println("0");
        }

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a % b ==0){
            System.out.println(b + "는 " + a + "의 약수입니다.");
        } else{
            System.out.println(b + "는 " + a + "의 약수가 아닙니다.");
        }

        if(a % b != 0){
            System.out.println(b + "는 " + a + "의 약수가 아닙니다.");
        } else{
            System.out.println(b + "는 " + a + "의 약수입니다.");
        }

        if(a % 10 == 0){
            System.out.println(a +"는 10의 배수 입니다.");
        } else {
            System.out.println(a +"는 10의 배수가 아닙니다.");
        }

        int q = scan.nextInt();

        if(q % 3 == 0){
            System.out.println("3으로 나누어집니다.");
        } else if (q % 3 == 1) {
            System.out.println("3으로 나누어 나머지가 1입니다.");
        } else {
            System.out.println("3으로 나누어 나머지가 2입니다.");
        }
    }
}
