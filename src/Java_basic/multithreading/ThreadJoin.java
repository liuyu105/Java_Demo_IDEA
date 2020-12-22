package Java_basic.multithreading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        //t.join()等待t线程结束后再继续运行
        t.join();
        System.out.println("end");

    }
}
