package Day0408;

import jdk.jshell.EvalException;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for(int i = 0;i < 5; i++){
            System.out.println("이름을 입력하세요 >>");
            String s = scan.next();
            a.add(s);
        }

        for(int i = 0; i < a.size(); i++){
            String name = a.get(i);
            System.out.println(name + " ");
        }

        int longIndex = 0;
        for(int i = 1; i < a.size(); i++){
            if(a.get(i).length() > a.get(longIndex).length()){
                longIndex = i;
            }
        }
        System.out.println("\n"+"가장 긴 이름은 >> " + a.get(longIndex) + "입니다.");
    }
}
