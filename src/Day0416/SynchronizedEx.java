package Day0416;


class sharedBoard{
    private int sum = 0;
    synchronized void add(){
        int n = sum;
        Thread.yield();
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + " : " + sum);
    }
    public  int getSum(){
        return sum;
    }
}
class StudentThread extends Thread {
    private sharedBoard board;
    public StudentThread(String name, sharedBoard board){
        super(name);
        this.board = board;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            board.add();
        }
    }

    public static void main(String[] args) {
        sharedBoard board = new sharedBoard();
        Thread t1 = new StudentThread("길동", board);
        Thread t2 = new StudentThread("순신", board);

        t1.start();
        t2.start();
    }
}
