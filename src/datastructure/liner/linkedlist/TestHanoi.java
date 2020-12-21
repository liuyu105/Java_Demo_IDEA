package datastructure.liner.linkedlist;

//汉诺塔
public class TestHanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    /**
     * @param n    共有n个盘子
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     * 无论有多少个盘子，都认为只有两个，上面的所有盘子和最下面的一个盘子
     */
    public static void hanoi(int n, char from, char in, char to) {
        //只有一个盘子
        if (n == 1) {
            System.out.println("把第1个盘子从" + from + "移到" + to);
            //上面的所有盘子和最下面的一个盘子
        } else {
            //移动上面所有的盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("把第"+n+"个盘子从" + from + "移到" + to);
            //把上面的所有盘子从中间位置移到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
