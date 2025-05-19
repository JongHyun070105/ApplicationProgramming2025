package license.Day0519;

//public class Exam01 {
//    public static void main(String[] args) {
//        String s = "red";
//        boolean[] b = new boolean[1];
//        if(b[0]) s = "blue";
//        System.out.println(s);
//    }
//}


//class ovr1{
//    public static void main(String[] args) {
//        ovr1 a1 = new ovr1();
//        ovr2 a2 = new ovr2();
//
//        System.out.println(a1.san(3,2) + a2.san(3,2));
//    }
//
//    int san(int x, int y){
//        return x + y;
//    }
//}
//
//class ovr2 extends ovr1{
//    int san(int x, int y){
//        return x - y + super.san(x, y);
//    }
//}

//class Soojebi{
//    static private Soojebi instance = null;
//    private int count = 0;
//    static public Soojebi get(){
//        if(instance == null){
//            instance = new Soojebi();
//        }
//        return instance;
//    }
//    public void count(){
//        count++;
//    }
//    public int getCount(){
//        return count;
//    }
//}
//
//public class Exam01{
//    public static void main(String[] args) {
//        Soojebi s1 = Soojebi.get();
//        s1.count();
//        Soojebi s2 = Soojebi.get();
//        s2.count();
//        Soojebi s3 = Soojebi.get();
//        s3.count();
//        System.out.println(s1.getCount());
//    }
//}

//public class Exam01{
//    public static void main(String[] args) {
//        System.out.println(Exam01.check(1));
//    }
//
//
//    static String check(int num){
//        return (num>=0) ? "positive" : "negative";
//    }
//}

//public class Exam01{
//    public static void main(String[] args) {
//        int a = 3, b = 4, c = 3, d = 5;
//        if((a == 2 | a == c) & (c > d) & (1 == b ^ c != d)){
//            a = b + c;
//            if(7 == b ^ c != a){
//                System.out.println(a);
//            } else {
//                System.out.println(b);
//            }
//        }
//        else{
//            a = c + d;
//            if(7 == c ^ d != a){
//                System.out.println(a);
//            } else {
//                System.out.println(d);
//            }
//        }
//    }
//}

//public class Exam01{
//    static int sum(int[] arr, int i){
//        if( i == arr.length) return 0;
//        return arr[i] + sum(arr, i+1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        System.out.println(sum(arr, 0));
//    }
//}

//public class Exam01 {
//    static int countEven(int[] arr, int i){
//        if( i < 0) return 0;
//        return (arr[i] % 2 == 0 ? 1 : 0) + countEven(arr,i -1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 6, 1, 8, 7};
//        System.out.println(countEven(arr,arr.length -1 ));
//    }
//}

//public class Exam01{
//    static int mystery(int n) {
//        if (n <= 1) return 1;
//        return n % 2 + mystery(n - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(mystery(5));
//    }
//}

//public class Exam01 {
//    static int calc(int[] a, int n){
//        if(n == 0) return a[0];
//        return a[n] * calc(a, n-1);
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 1, 3};
//        System.out.println(calc(nums, 2));
//    }
//}

//public class Exam01 {
//    static int recur(int n){
//        if(n < 0) return 1;
//        return n + recur(n-2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(recur(5));
//    }
//}

//public class Exam01{
//    static int sumDigits(int n){
//        if(n == 0)return 0;
//        return n % 10 + sumDigits(n / 10);
//    }
//    public static void main(String[] args) {
//        System.out.println(sumDigits(253));
//    }
//}

//public class Exam01{
//    static int pow(int base, int exp){
//        if(exp == 0) return 1;
//        return base * pow(base, exp - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(pow(2,4));
//    }
//}
