package Leetcode.linklist;

public class Leetcode83 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);

		SingleLinkedList singleLinkedList = new SingleLinkedList();

		singleLinkedList.add(l1);
		singleLinkedList.add(l2);
		singleLinkedList.add(l3);
		singleLinkedList.add(l4);
		singleLinkedList.list();
		ListNode a=deleteDuplicates(singleLinkedList.getHead());
		
		SingleLinkedList sl = new SingleLinkedList();
		sl.add(a);
		sl.list();
		//System.out.println();

	}

	// 
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode first = head;
		while (first != null && first.next != null) {
			if (first.val == first.next.val) {
				first.next = first.next.next;
			} else {
				first = first.next;
			}
		}
		return head;
	}
}

////
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//	}
//}

class SingleLinkedList {
	// 
	private ListNode head = new ListNode(0);

	// 
	public ListNode getHead() {
		return head;
	}

	// 
	public void add(ListNode heroNode) {
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = heroNode;
	}


	public void list() {

		if (head == null) {
			System.out.println("链表为空");
			return;
		}
		
		ListNode temp = head.next;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
