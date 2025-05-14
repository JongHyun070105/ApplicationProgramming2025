package license.Day0514;

public class Problem19 {
    public static void main(String[] args) {
        for(int m = 0; m < 10; m ++){
            if(m%2 == 0)
                continue;
            System.out.print(m);
        }
    }
}
