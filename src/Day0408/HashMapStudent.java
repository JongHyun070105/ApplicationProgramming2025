package Day0408;

import java.util.HashMap;
import java.util.Scanner;

class Student{
    int id;
    String tel;
    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
}

public class HashMapStudent {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("김장호", new Student(6, "010-1234-5678"));
        map.put("김현우", new Student(7, "010-2345-6789"));
        map.put("강보성", new Student(8, "010-3456-7890"));

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("검색할 이름 : ");
            String name = scan.next();
            if(name.equals("exit")) break;
            Student student = map.get(name);
            if(student == null){
                System.out.println(name + " 없는 학생입니다.");
            }
            else {
                System.out.println("id : " + student.id +  " tel : " + student.tel);
            }
        }
        scan.close();
    }
}
