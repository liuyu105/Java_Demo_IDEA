package Leetcode.linklist;

public class Leetcode707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList link=new MyLinkedList();
		link.addAtHead(1);
		link.addAtTail(3);
		link.print();
	}
}
	class MyLinkedList {

	    private class Node{
	        public int val;
	        public Node next;
	        public Node(int val){
	            this.val=val;
	        }
	    }
	    
	    public Node head;
	    int size;
	    /** Initialize your data structure here. */
	    public MyLinkedList() {
	        head=new Node(-1);
	        size=0;
	    }
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(index<0||index>=size) return -1;
	        Node cur=head.next; //��ָ���0��Ԫ��
	        for(int i=0;i<index;i++){
	            cur=cur.next;
	        }
	        return cur.val;            
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        addAtIndex(0,val);
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	        addAtIndex(size,val);
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. 
	     * If index equals to the length of linked list, the node will be appended to the end of linked list.
	     *  If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	        if(index>size) return;
	        if(index<0) addAtHead(val);
	        Node cur=head;
	        for(int i=0;i<index;i++){
	            cur=cur.next; //curָ���i��Ԫ��
	        }
	        Node p=cur.next;
	        Node add=new Node(val);
	        add.next=p;
	        cur.next=add;
	        size++;
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	        if(index<0||index>=size) return;
	        Node pre=head;
	             for(int i=0;i<index;i++){
	                 pre=pre.next; //ָ��ɾ����ǰһ��
	             }
	             Node cur1=pre.next;
	             pre.next=cur1.next;
	             cur1.next=null;
	            size--;
	     }
	    public void print() {
	    	Node cur=head.next;
	    	while(cur!=null) {
	    		System.out.println(cur.val);
	    		cur=cur.next;
	    	}
	    }
}
	



