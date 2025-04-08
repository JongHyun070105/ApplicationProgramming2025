package Day0408;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();

        score.put("김동균", 90);
        score.put("주시우", 80);
        score.put("박태영", 70);
        score.put("신재우", 60);
        score.put("문현중", 100);

        System.out.println("HashMap의 요소 개수 >>" + score.size());

        Set<String> keys = score.keySet();

        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String name = it.next();
            int javascore = score.get(name);
            System.out.println(name + " : " + javascore);
        }
    }
}
