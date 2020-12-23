package Java_basic.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    //往队列中添加任务
    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notifyAll();//唤醒在this锁等待的线程
    }

    //取出队列的第一个任务
    public synchronized String getTask() throws InterruptedException {
        //如果队列为空，就循环等待，直到另一个线程往队列中放入了一个任务
        while (queue.isEmpty()) {
            // 释放this锁:
            this.wait();
            // 重新获取this锁
        }
        return queue.remove();
    }
}
