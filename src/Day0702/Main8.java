package Day0702;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ranges = new int[10];

        System.out.println("1부터 100 사이의 정수 10개를 입력하세요:");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (num >= 1 && num <= 100) {
                int index = (num - 1) / 10;
                ranges[index]++;
            } else {
                System.out.println("1~100 사이의 숫자만 입력하세요.");
                i--;
            }
        }

        for (int i = 0; i < ranges.length; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;

            System.out.printf("%2d - %3d: ", start, end);
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
