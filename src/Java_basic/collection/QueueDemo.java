package Java_basic.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        //添加三个元素到队列
        q.add("apple");
        q.offer("pear");
        q.offer("banana");
        //从队列取出元素
        //取出首元素并删除
        System.out.println(q.poll());
        System.out.println(q.remove());
        //取出首元素但不删除
        System.out.println(q.peek());
        System.out.println(q.element());
    }
}
