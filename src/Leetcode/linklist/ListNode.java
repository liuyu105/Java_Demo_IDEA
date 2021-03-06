package Leetcode.linklist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newval);
        }
    }

    //打印链表
    public void print() {

        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("->");
            this.next.print();
        }
    }

}
