package datastructure.liner;

/**
 * 单链表的结点
 */
public class Node {
    //    private Object data;
//    private Node next;
    Object data;
    Node next;

    public Node() {

    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
