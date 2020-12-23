package Java_basic.multithreading;

import java.util.ArrayList;
import java.util.List;

public class TaskQueueDemo {
    public static void main(String[] args) {
        TaskQueue q = new TaskQueue();
        List<Thread> ts = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread() {
                public void run() {
                    //执行task:
                    while (true) {
                        try {
                            String s = q.getTask();
                            System.out.println("execute task: " + s);
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
    }
}
