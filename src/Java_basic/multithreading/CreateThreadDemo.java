package Java_basic.multithreading;

public class CreateThreadDemo {
    public static void main(String[] args) {
        //创建一个新线程
        //方法一：从Thread派生一个自定义类，然后覆写run()方法
        //Thread t = new MyThread();
        //方法二:创建Thread实例时，传入一个Runnable实例
        //Thread t = new Thread(new MyRunnable());
        //方法三：用Java8引入的lambda语法进一步简写
        Thread t = new Thread(() -> {
            System.out.println("start new thread!");
        });
        t.start(); // 启动新线程
    }
}
