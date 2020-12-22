package Java_basic.multithreading;

public class SynchronizedThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.lock) { //获取锁
                Counter.count += 1;
            } //释放锁
        }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
    }
}
