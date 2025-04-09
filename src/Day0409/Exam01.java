package Day0409;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam01 {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int max = 0;

        while(true){
            if(number == -1){
                System.out.println(max);
                break;
            }
            num.add(number);
            number = scan.nextInt();
            if(max < number){
                max = number;
            }
        }

    }
}