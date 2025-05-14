package license.Day0514;

interface  Cals{
    public void get(int v);
}
class Test implements Cals{
    public void get(int v){
        System.out.println(v*v);
    }
}
public class Problem15 {
    public static void main(String[] args) {
        Cals a = new Test();
        a.get(10);
    }
}
