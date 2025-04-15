package Day0415;

// Double ArrayList 10개 지정
// 10명의 심사위원의 점수를 Scanner로 받습니다
// 가장 높은 점수와 가장 낮은 점수를 제외하고
// 나머지 점수의 평균을 출력하는 프로그램

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimsaScore {
    public static void main(String[] args) {
        ArrayList<Double>  scores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i ++){
            System.out.println((i+1) + "번 심사위원의 점수 >>");
            double num = scan.nextDouble();
            scores.add(num);
        }
        double max = Collections.max(scores);
        double min = Collections.min(scores);
        
        int cnt = 0;
        double sum = 0.0;
        
        for(double num : scores){
            if(num != max && num != min){
                sum += num;
                cnt++;
            }
        }
        System.out.println("심사위원의 평균 >> " + sum/cnt);
    }
}
