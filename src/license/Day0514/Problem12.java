package license.Day0514;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        int isNum;
        Scanner scan01 = new Scanner(System.in);
        isNum = scan01.nextInt();
        if(isNum % 2 == 0){
            System.out.printf("%d = 짝수입니다 \n", isNum);
        } else{
            System.out.printf("%d = 홀수입니다 \n", isNum);
        }
        scan01.close();
    }
}
