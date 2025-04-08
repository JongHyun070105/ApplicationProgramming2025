package Day0408;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        // 제네릭 => 과일 도시락, 밥 도시락
        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(4); // => v.add(Integer.valueOf(4)) 4라는 정수를 객체화 시켜서 넣는다
        // Integer n = v.get(1);
        // int num = n.intValue() 이 과정 없이 자바에서 자동으로 박싱 언박싱 해줌
        v.add(100);
        v.add(2, 77);

        System.out.println("벡터 내의 요소 객체 수 >> " + v.size() + '\n');

        int i;
        for (i = 0; i < v.size(); i++) {
            int n = v.get(i); // v.get(i).intValue();
            System.out.println(n);
        }
        System.out.println('\n');
        // 벡터 속의 모든 정수 더하기
        int sum = 0;
        for (i = 0; i < v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터 내의 있는 값의 함 >>" + sum);
    }
}
