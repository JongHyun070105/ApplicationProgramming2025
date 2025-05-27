package license.Day0527;

//public class Exam01 {
//    static String[] s = new String[3];
//    static void func(String[] s, int size){
//        for(int i = 1; i<size;i++){
//            if(s[i-1].equals(s[i])){
//                System.out.print("O");
//            } else{
//                System.out.print("N");
//            }
//        }
//        for(String m : s){
//            System.out.print(m);
//        }
//    }
//
//    public static void main(String[] args) {
//        s[0] = "A";
//        s[1] = "A";
//        s[2] = new String("A");
//
//        func(s,3);
//    }

//    static String[] s = new String[3];
//
//    static void check(String[]s, int size){
//        for(int i = 1; i < size; i++){
//            if(s[i - 1] == s[i]){
//                System.out.print("S");
//            } else{
//                System.out.print("D");
//            }
//        }
//        for(String str : s){
//            System.out.print(str);
//        }
//    }
//
//    public static void main(String[] args) {
//        s[0] = "B";
//        s[1] = "B";
//        s[2] = new String("B");
//
//        check(s,3);
//    }

//    static String[] arr = {"X", "Y", "Y"};
//
//    static void compare(String[] arr){
//        for(int i = 0; i < arr.length - 1; i++){
//            if(arr[i].equals(arr[i+1])){
//                System.out.print("E");
//            } else{
//                System.out.print("N");
//            }
//        }
//        for(String a : arr){
//            System.out.print(a);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        compare(arr);
//    }

//    static String[] data = {"Cat", new String("Cat"), "Dog"};
//
//    static void match(String[] data){
//        for(int i = 0; i < 2; i++){
//            if(data[i] == data[i + 1]){
//                System.out.print("R");
//            } else if (data[i].equals(data[i + 1])) {
//                System.out.print("V");
//            } else {
//                System.out.print("X");
//            }
//        }
//
//        for(String d : data){
//            System.out.print(d.charAt(0));
//        }
//    }
//
//    public static void main(String[] args) {
//        match(data);
//    }

//    public static void main(String[] args) {
//        Base a = new Derivate();
//        Derivate b = new Derivate();
//
//        System.out.println(a.getX() + a.x + b.getX() + b.x);
//    }


//}

//class Base{
//    int x = 3;
//
//    int getX(){
//        return x * 2;
//    }
//}
//
//class Derivate extends Base{
//    int x = 7;
//
//    int getX(){
//        return x * 3;
//    }
//}


class Exam01{
    public static class Collection<T>{
        T value;

        public Collection(T t){
            value = t;
        }

        public void print(){
            new Printer().print(value);
        }

        class Printer{
            void print(String a){
                System.out.print("S" + a);
            }

            void print(Object a){
                System.out.print("T" + a);
            }
        }

        public static class Collection2<T extends Number>{
            T value;

            public Collection2(T t){
                value = t;
            }

            public void print(){
                new Printer().print(value);
            }

            class Printer{
                void print(Float a){
                    System.out.print("F" + a);
                }
                void print(Number a){
                    System.out.print("N" + a);
                }
                void print(Object a){
                    System.out.print("O" + a);
                }
            }
        }

        public static class Collection3<T>{
            T value;

            public Collection3(T t){
                value = t;
            }

            public void print(){
                new Printer().print((Integer)value);
            }

            class Printer{
                void print(Integer a){
                    System.out.print("I" + a);
                }
                void print(Object a){
                    System.out.print("J" + a);
                }
                void print(Number a){
                    System.out.print("K" + a);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Collection<>("hello").print();
        System.out.print("\n");
        new Collection.Collection2<>(5.5f).print();
        System.out.print("\n");
        new Collection.Collection3<>(42).print();
    }
}