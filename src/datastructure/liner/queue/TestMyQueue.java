package datastructure.liner.queue;

public class TestMyQueue {
    public static void main(String[] args) {
        //创建一个队列
        MyQueue mq=new MyQueue();
        //入队
        mq.add(9);
        mq.add(8);
        mq.add(7);
        //出队
        mq.poll();
        System.out.println(mq.poll());
        System.out.println(mq.isEmpty());

    }
}
