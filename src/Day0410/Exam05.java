package Day0410;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam05 {
    // Vector 강수량 입력
    // 입력할 때 마다 평균을 구해서 출력
    // 강수량 입력(0 입력 시 종료) >> 5
    // 5
    // 현재 평균 : 5
    // 강수량 입력(0 입력 시 종료) >> 80
    // 5 80
    // 현재 평균 : 42.5

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<Integer> rain =  new Vector<>();

        while(true){
            System.out.println("강수량 입력(0 입력 시 종료) >> ");
            int n = scan.nextInt();
            if(n == 0) break;
            rain.add(n);
            double sum = 0.0;
//            for(Integer i : rain){
//                System.out.println(i + " ");
//                sum += i;
//            }
            Iterator<Integer> it = rain.iterator();
            while(it.hasNext()){
                sum += it.next();
            }
            System.out.println("\n 현재 평균 : " + (sum/rain.size()));
        }
    }
}
