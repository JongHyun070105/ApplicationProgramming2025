package Day0408;

import java.util.Vector;

class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();

        v.add(new Point(1,2));
        v.add(new Point(3,4));
        v.add(new Point(5,6));
        v.add(new Point(7,8));

        v.remove(2);

        System.out.println("벡터 내의 요소 객체 수 >> " + v.size() + '\n');

        for(int i = 0; i < v.size(); i++){
            Point p = v.get(i);
            System.out.println(p);
        }
    }
}
