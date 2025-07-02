package Day0702;

import java.util.Scanner;

public class MeanScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학생의 수를 입력하시오: ");
        int a = scan.nextInt();
        System.out.print("학생1의 성적을 입력하시오: ");
        int b = scan.nextInt();
        System.out.print("학생2의 성적을 입력하시오: ");
        int c = scan.nextInt();

        float sum;

        if(b > 100){
            System.out.println("잘못된 성적입니다. 다시 입력하시오.");
            System.out.print("학생1의 성적을 입력하시오: ");
            b = scan.nextInt();
        } else if (c > 100) {
            System.out.println("잘못된 성적입니다. 다시 입력하시오.");
            System.out.print("학생2의 성적을 입력하시오: ");
            c = scan.nextInt();
        }

        sum = (b + c) / a;
        System.out.println("성적 평균은 " + sum + "입니다.");

    }
}