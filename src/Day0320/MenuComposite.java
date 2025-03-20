package Day0320;

import java.util.ArrayList;

// Component
interface Node {
    // 계층 트리 출력
    void print();
    void print(String str);

    // 파일 / 폴더 용량 얻기
    int getSize();
}

// Composite
class Folder implements Node {
    private String name; // 폴더 이름

    private ArrayList<Node> list;

    public Folder(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    // 리스트에 폴더, 파일 추가
    public void add(Node node) {
        list.add(node);
    }

    // 공백 indent 표현 처리를 위한 print 메서드 오버로딩
    public void print() {
        this.print("");
    }

    public void print(String str) {
        int size = getSize(); // 폴더가 담고 있는 모든 파일에 대한 용량 합산

        System.out.println(str + "\uD83D\uDCC2" + name + " (" + size + "kb)");

        for (Node node : list) {
            // Folder 일 경우 재귀 동작
            node.print(str + "    "); // 인자로 공백문자를 할당하여 indent 처리
        }
    }

    // 각 파일의 용량(kb) 구하기
    public int getSize() {
        int sum = 0;
        for (Node node : list) {
            sum += node.getSize(); // print 로직과 똑같이 재귀 동작
        }
        return sum;
    }
}

// Leaf
class File implements Node {
    private String name; // 파일 이름
    private int size; // 파일 사이즈

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void print() {
        this.print("");
    }

    public void print(String str) {
        System.out.println(str + "\uD83D\uDCDC" + name + " (" + size + "kb)");
    }

    public int getSize() {
        return size;
    }
}

class Client {
    public static void main(String[] args) {

        Folder root = new Folder("root");

        File file1 = new File("file1", 10);
        Folder sub1 = new Folder("sub1");
        Folder sub2 = new Folder("sub2");

        root.add(sub1);
        root.add(file1);
        root.add(sub2);

        File file11 = new File("file11", 10);
        File file12 = new File("file12", 10);

        sub1.add(file11);
        sub1.add(file12);

        File file21 = new File("file21", 10);

        sub2.add(file21);

        // 전체 dir 출력
        root.print();
    }
}