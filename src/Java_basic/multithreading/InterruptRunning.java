package Java_basic.multithreading;

public class InterruptRunning {
    public static void main(String[] args) throws InterruptedException {
        HelloThread2 t = new HelloThread2();
        t.start();
        Thread.sleep(1);
        t.running = false;// 标志位置为false
    }
}

class HelloThread2 extends Thread {
    //volatile是线程间共享的变量，确保每个线程都能读取到更新后的变量值
    public volatile boolean running = true;

    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + "hello!");
        }
        System.out.println("end!");
    }
}