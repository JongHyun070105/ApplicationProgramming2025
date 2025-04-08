package Day0408;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1,40);

        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }

        int sum = 0;
        it = a.iterator();
        while(it.hasNext()){
            int n = it.next();
            sum += n;
        }
        System.out.println("\n" + "어레이 리스트에 있는 정수 합 >> " + sum);
    }
}
