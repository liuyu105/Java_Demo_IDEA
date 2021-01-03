package Leetcode.linklist;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Leetcode19_RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.add(2);
//        head.add(3);
//        head.add(4);
//        head.add(5);
        head.print();
        Leetcode19_RemoveNthNodeFromEndofList.removeNthFromEnd2(head, 1);
        System.out.println();
        head.print();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 0;
        //统计节点的个数
        while (node != null) {
            size++;
            node = node.next;
        }

        if (n <= 0 || n > size) {
            return null;
        }
        ListNode result = head;
        //指向要删除的前一个节点
        for (int i = 1; i < size - n; i++) {
            result = result.next;
        }

        //result当前指向head，要删除首元素
        if (n == size) {
            return head.next;
        }

//        //如果要删除最后一个节点，需特殊考虑边界
//        if (n == 1) {
//            result.next = result.next.next;
//            return head;
//        }
        else {
            //result.next.val = result.next.next.val;
            result.next = result.next.next;
        }

        return head;
    }

    //设置哑节点
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        //统计head长度
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }

        ListNode cur = dummy;
        //指向要删除的前一个节点
        for (int i = 1; i < size - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    //方法三:栈
    public static ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        //压入栈内
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        //获取待删除的前驱结点
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;
    }

}

