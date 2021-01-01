package Leetcode.linklist;

public class Leetcode237_DeleteNodeinaLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.print();
        Leetcode237_DeleteNodeinaLinkedList.deleteNode(head);
        System.out.println();
        head.print();
    }

    public static void deleteNode(ListNode node) {
        // 因为无法访问前一个结点，所以可以把要删除的结点的后一个结点的值前移
        node.val = node.next.val;
        // 然后删除掉后一个结点
        node.next = node.next.next;
    }
}
