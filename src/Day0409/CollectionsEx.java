package Day0409;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

    static void printList(LinkedList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String e = it.next();
            String separator;
            if (it.hasNext()) {
                separator = " -> ";
            }
            else{
                separator = "\n";
            }
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);

        Collections.shuffle(myList);
        printList(myList);

        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번쨰 요소입니다.");
    }
}
