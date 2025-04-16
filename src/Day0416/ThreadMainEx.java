package Day0416;

public class ThreadMainEx {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId(); // id
        String name = Thread.currentThread().getName(); // 이름
        int priority = Thread.currentThread().getPriority(); // 우선 순위
        Thread.State state = Thread.currentThread().getState(); // 현재 스레드의 상태 (NEW, RUNNABLE, WAITING, TIMED_WAITING, BLOCK, TERMINATED)

        System.out.println("현재 스레드의 id : " + id);
        System.out.println("현재 스레드의 이름 : " + name);
        System.out.println("현재 스레드의 우선순위 : " + priority);
        System.out.println("현재 스레드의 상태 : " + state);
    }
}
