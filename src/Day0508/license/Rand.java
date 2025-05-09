package Day0508.license;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Random rand = new Random();
//        // 난수 생성
//        int r1 = 1 + rand.nextInt(9); // 1 ~ 9까지
//        int r2 = (rand.nextInt(9)+1) * -1; // -1 ~ -ㄲ9까지
//        // int r2 = -1 - rand.nextInt(9)
//        // 10 ~ 99
//        int r3 = rand.nextInt(10,99);
//        System.out.println("3개의 난수 생성");
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);
//
//        // 하나의 값을 입력해서 그 값의  +-5 범위의 난수 생성
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int r4 = rand.nextInt(11) - 5;
//        System.out.println("입력값 " + x + "의 +-5범위의 난수 : " + (x + r4));
//
//        double x5 = rand.nextDouble(); // 0.0. ~ 1.0 미만
//        System.out.println("x = " + x5);
//        // rand.nextDouble 사용해서 0.0이사 10.0 미만
//        double x2 = rand.nextDouble( 0.9) * 10;
//        System.out.println(x2);
//        double x3 = rand.nextDouble() * 2 -1;

        int lucky = rand.nextInt(10);

        switch (lucky){
            case 0 :
                System.out.println("대박");
                break;
            case 1, 2, 3 :
                System.out.println("중운");
                break;
            case 4, 5, 6 :
                System.out.println("소운");
                break;
            case 7, 8 :
                System.out.println("소흉");
                break;
            case 9 :
                System.out.println("대흉");
        }
    }
}
