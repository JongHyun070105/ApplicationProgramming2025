package license.Day0520;

public class Exma02 {
    static int multOddIndex(int[] arr, int i){
        if(i < 0) return 1;
        if(i % 2 == 1) return arr[i] * multOddIndex(arr, i -1);
        return multOddIndex(arr, i -1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(multOddIndex(arr,4));
    }
}
