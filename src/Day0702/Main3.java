package Day0702;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] ls = new int[] {9,8,7,6,5,4,3,2,1};
        Arrays.sort(ls);
        System.out.print("배열 정렬 : ");

        for (int s : ls) {
            System.out.print(s + ", ");
        }
        int index = Arrays.binarySearch(ls, 3);
        System.out.println();
        System.out.println("3의 위치 : " + (index + 1) + "번째");
    }
}
