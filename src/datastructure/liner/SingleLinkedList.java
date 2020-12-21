package datastructure.liner;

import datastructure.liner.array.List;
import datastructure.liner.array.MyArrayIndexOutOfBoundsException;

public class SingleLinkedList implements List {
    private Node head = new Node(); //头结点，不存储数据，为了编程方便
    private int size; //一共有多少个结点

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        Node p = head;
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        Node p = head.next;
        int i;
        for (i = 0; i < size; i++) {
            if (p.data.equals(e)) break;
            p = p.next;
        }
        if (i < size) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int indexOf(Object e) {
        Node p = head.next;
        int i;
        for (i = 0; i < size; i++) {
            if (p.data.equals(e)) break;
            p = p.next;
        }
        if (i < size) {
            return i;
        } else {
            return -1;
        }
    }

    @Override
    public void add(int i, Object e) {
        //若在结点4跟5之间插入一个数（结点从0开始），则调用add(5,e)
        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("链表指针越界异常：" + i);
        }
        //找到前一个结点，从head结点开始
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        //新建一个结点
        Node newNode = new Node(e);
        newNode.data = e;
        //指明新结点的直接后继结点
        newNode.next = p.next;
        //指明新结点的直接前驱结点
        p.next = newNode;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);
    }

    @Override
    public void addAfter(int i, Object e) {
        this.add(i + 1, e);
    }

    @Override
    public Object remove(int i) {
        Node p = head;
        //指向删除的前一个结点
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        //System.out.println(p.next.data);
        //保存删除值
        Object result = p.next.data;
        //删除结点
        p.next = p.next.next;
        //个数减少
        size--;
        return result;
    }

    @Override
    public boolean remove(Object e) {
        int oldSize = size;
        Node p = head;
        for (int j = 0; j < size; j++) {
            p = p.next;
            if (p.data.equals(e)) {
                this.remove(j--); //j--很重要
            }
        }
        if (oldSize > size) {
            return true;
        } else return false;

    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node p = head.next;
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                builder.append(p.data + ",");
            } else {
                builder.append(p.data);
            }
            //移动指针到下一个结点
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
