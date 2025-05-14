package license.Day0514;

public class Problem06 {
    public static void main(String[] args) {
        int j, k, l, result;
        j = 10;
        k = 20;
        l = 30;
        result = j < k ? k++ : --l;
        System.out.printf("%d %d %d\n", result, k, l);
    }
}
