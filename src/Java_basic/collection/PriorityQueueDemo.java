package Java_basic.collection;

import java.util.PriorityQueue;
import java.util.Queue;

//优先队列
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //Queue<String> q = new PriorityQueue<>();
//        q.offer("apple");
//        q.offer("pear");
//        q.offer("banana");
//        System.out.println(q.poll()); // apple
//        System.out.println(q.poll()); // banana
//        System.out.println(q.poll()); // pear
//        System.out.println(q.poll()); // null,因为队列为空

        //以银行排队业务为例
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        q.offer(new User("Alice","A2"));
        q.offer(new User("Bob","A1"));
        q.offer(new User("Boss","V1"));
        System.out.println(q.poll()); //Boss/V1
        System.out.println(q.poll()); //Bob/A1
        System.out.println(q.poll()); //Alice/A2

    }
}
