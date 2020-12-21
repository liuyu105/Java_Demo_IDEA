package datastructure.liner.linkedlist;

public class TestFebonacci {
    public static void main(String[] args) {
        //斐波那契数列：1 1 2 3 5 8 13
        int i=febonacci(3);
        System.out.println(i);

    }

    //打印第n项的斐波那契数列
    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i-2)+febonacci(i-1);
        }
    }
}
