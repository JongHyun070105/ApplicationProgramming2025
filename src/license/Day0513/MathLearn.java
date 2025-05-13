package license.Day0513;

public class MathLearn {
    public static void main(String[] args) {
        System.out.println(Math.abs(-7)); // 절대값
        System.out.println(Math.abs(7)); // 절대값

        System.out.println(Math.signum(-7)); // 양수면 1, 음수면 -1, 0이면 0을 반환
        System.out.println(Math.signum(7)); // 양수면 1, 음수면 -1, 0이면 0을 반환
        System.out.println(Math.signum(0)); // 양수면 1, 음수면 -1, 0이면 0을 반환

        System.out.println(Math.min(7,10)); // 최소값
        System.out.println(Math.max(7,10)); // 최대값

        System.out.println(Math.round(7.7)); // 정수값으로 나옴 반올림
        System.out.println(Math.round(7.3));  // 정수값으로 나옴 버림

        System.out.println(Math.rint(7.7)); // 실수값으로 나옴 반올림
        System.out.println(Math.rint(7.3)); // 실수값으로 나옴 버림

        System.out.println(Math.ceil(7.7)); // 무조건 올림
        System.out.println(Math.ceil(7.3)); // 무조건 올림

        System.out.println(Math.floor(7.7)); // 무조건 버림
        System.out.println(Math.floor(7.3)); // 무조건 버림

        System.out.println(Math.sqrt(9)); // 실수값, 루트(제곱근)
        System.out.println(Math.sqrt(25)); // 실수값, 루트(제곱근)

        System.out.println(Math.cbrt(1000)); // 실수값, 세제곱근
    }
}
