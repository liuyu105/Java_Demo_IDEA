package Java_basic.multithreading;

//方法一：从Thread派生一个自定义类，然后覆写run()方法
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread!");
        int n = 0;
        while (! isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }
}
