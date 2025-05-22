package license.Day0522;

public class Exam01 {
    public static void main(String[] args) {
        System.out.println(calc("3"));
    }

    static int calc(int value){
        if(value == 0) return 1;
        return calc(value - 1) +1;
    }

    static int calc(String str){
        int value = Integer.parseInt(str);
        return calc(value) + calc(value - 1);
    }
}
