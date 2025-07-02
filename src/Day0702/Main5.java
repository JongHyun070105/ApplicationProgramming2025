package Day0702;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        StringBuffer sb = new StringBuffer(a);
        String reversedStr = sb.reverse().toString();

        System.out.println(reversedStr);
    }
}
