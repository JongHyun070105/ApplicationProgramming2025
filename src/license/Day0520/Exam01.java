package license.Day0520;

public class Exam01 {
    public static void main(String[] args) {
//        String t1 = "4-1a2";
//        String t2 = "5-523";
//
//        int res = 0;
//
//        for(int i = 0; i < 5; i++){
//            try{
//                res += Character.getNumericValue(t2.charAt(Character.getNumericValue(t1.charAt(i))));
//            } catch (Exception e){
//                res -= 1;
//            } finally {
//                res += 1;
//            }
//        }
//        System.out.printf("%d", res);

//        String a = "91z2b";
//        String b = "83419";
//        int sum = 0;
//
//        for (int i = 0; i < a.length(); i++) {
//            try {
//                sum += Character.getNumericValue(b.charAt(Character.getNumericValue(a.charAt(i))));
//            } catch (Exception e) {
//                sum -= 2;
//            } finally {
//                sum += 1;
//            }
//        }
//        System.out.printf("%d", sum);

//        String x = "5x3a2";
//        String y = "26789";
//        int result = 0;
//
//        for(int i = 0; i < 5; i++){
//            try{
//                result += Character.getNumericValue(y.charAt(Character.getNumericValue(x.charAt(i))));
//            } catch (Exception e){
//                result -= 3;
//            } finally {
//                result += 1;
//            }
//        }
//        System.out.print(result);

//        String str1 = "24b7c";
//        String str2 = "14056";
//        int total = 0;
//
//        for(int i = 0; i < str1.length(); i++){
//            try{
//                total += Character.getNumericValue(str2.charAt(Character.getNumericValue(str1.charAt(i))));
//            } catch (Exception e){
//                total--;
//            } finally {
//                total++;
//            }
//        }
//        System.out.println(total);

//        int a = 5, b = 0;
//
//        try{
//            System.out.println(a/b);
//        } catch (ArithmeticException e){
//            System.out.println("출력1");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("출력2");
//        } catch (NumberFormatException e) {
//            System.out.println("출력3");
//        } catch (Exception e) {
//            System.out.println("출력4");
//        } finally {
//            System.out.println("출력5");
//        }

//        String s = null;
//
//        try{
//            System.out.println(s.length());
//        } catch (NullPointerException e){
//            System.out.println("출력1");
//        } catch (Exception e){
//            System.out.println("출력2");
//        } finally {
//            System.out.println("출력3");
//        }

//        try{
//            String s = "123";
//            System.out.println(s.charAt(5));
//        } catch (StringIndexOutOfBoundsException e){
//            System.out.println("출력1");
//        } catch (Exception e){
//            System.out.println("출력2");
//        } finally {
//            System.out.println("출력3");
//        }

//        String s = "10";
//
//        try{
//            int a = Integer.parseInt(s);
//            int b = 10 / a;
//            System.out.println("출력1");
//        } catch (ArithmeticException e){
//            System.out.println("출력2");
//        } catch (NumberFormatException e){
//            System.out.println("출력3");
//        } finally {
//            System.out.println("출력4");
//        }

//        new Child();
//        System.out.println(Parent.total);

//        new B();
//        System.out.println(A.count);

//        int[] data = {3,5,8,12,17};
//        System.out.println(func(data, 0, data.length - 1));
//    }
//
//    static int func(int[] a, int st, int end){
//        if( st >= end) return 0;
//        int mid = (st + end) / 2;
//        return a[mid] + Math.max(func(a, st, mid) + 1, func(a, mid + 1, end));
    }
}

//class Parent{
//    static int total = 0;
//    int v = 1;
//
//    public Parent(){
//        total += (++v);
//        show();
//    }
//
//    public void show(){
//        total += total;
//    }
//}
//
//class Child extends Parent{
//    int v = 10;
//
//    public Child(){
//        v += 2;
//        total += v++;
//        show();
//    }
//
//    @Override
//    public void show(){
//        total += total * 2;
//    }
//}

//class A{
//    static int count = 1;
//    int x = 3;
//
//    public A(){
//        count += ++x;
//        print();
//    }
//
//    public void print(){
//        count += 5;
//    }
//}
//
//
//class B extends A{
//    int x = 10;
//
//    public B(){
//        x += 2;
//        count += x++;
//        print();
//    }
//
//    @Override
//    public void print(){
//        count *= 2;
//    }
//}