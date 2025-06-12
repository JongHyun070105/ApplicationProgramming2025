package license.Day0612;

public class Exam01 {
    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // 마지막 자릿수 추출
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; // 마지막 자릿수 제거
        }

        System.out.println("역순 출력: " + reversedNumber); // 결과: 4321
    }
}
