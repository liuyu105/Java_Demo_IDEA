package datastructure.liner.stack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack ms=new MyStack();
        ms.push(9);
        ms.push(8);
        ms.push(7);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
    }
}
