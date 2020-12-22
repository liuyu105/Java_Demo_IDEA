package Java_basic.multithreading;

import java.time.LocalTime;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new TimerThread();
        //t.setDaemon(true);
        t.start();
    }
}

class TimerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}