package license.Day0514;

public class Problem10 {
    public static void main(String[] args) {
        String str = "*ulsan*";
        int n = str.length();
        char[] st = new char[n];
        n--;
        for(int k = n; k >=0; k--){
            st[n - k] = str.charAt(k);
        }
        for (char k :st){
            System.out.printf("%c", k);
        }
    }
}
