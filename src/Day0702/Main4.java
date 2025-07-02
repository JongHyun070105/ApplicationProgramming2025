package Day0702;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("영어 문자열을 입력하세요: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("모음의 개수: " + vowelCount);
        System.out.println("자음의 개수: " + consonantCount);
    }
}
