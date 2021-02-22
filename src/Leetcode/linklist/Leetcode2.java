package Leetcode.linklist;

public class Leetcode2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.add(2);
        l1.add(3);
        l1.print();
        ListNode l2 = new ListNode(3);
        l2.add(8);
        l2.add(5);
        Leetcode2.addTwoNumbers(l1, l2).print();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int num = val1 + val2 + carry;
            carry = num / 10;

            ListNode l3 = new ListNode(num % 10);
            cursor.next = l3;
            cursor = l3;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return root.next;
    }
}
