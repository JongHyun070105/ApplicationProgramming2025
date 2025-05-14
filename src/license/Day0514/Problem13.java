package license.Day0514;

public class Problem13 {
    public static void main(String[] args) {
        int i, hap = 0;
        for(i =1; i <=5; ++i, hap += i)
            System.out.printf("합은%d %4d입니다.\n", i, hap);

    }
}
