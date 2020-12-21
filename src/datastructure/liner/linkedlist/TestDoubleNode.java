package datastructure.liner.linkedlist;

public class TestDoubleNode {
    public static void main(String[] args) {
        DoubleNode n1=new DoubleNode(1);
        DoubleNode n2=new DoubleNode(2);
        DoubleNode n3=new DoubleNode(3);
        //追加节点
        n1.after(n2);
        n2.after(n3);
        //查看上一个、自己和下一个节点的内容
        System.out.println(n2.pre().getData());
        System.out.println(n2.getData());
        System.out.println(n2.next().getData());
    }
}
