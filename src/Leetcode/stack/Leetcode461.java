package Leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode461 {
    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x, y));
    }

    //方法一：栈
    public static int hammingDistance(int x, int y) {
        int ans = 0;
        //模拟栈
        Deque<Integer> stack_x = new LinkedList<>();
        Deque<Integer> stack_y = new LinkedList<>();
        while (x != 0 || y != 0) {
            stack_x.push(x % 2);
            stack_y.push(y % 2);
            x = x / 2;
            y = y / 2;
        }

        //记录size长度，在pop过程中会动态变化，所以要提前记录
        int size=Math.max(stack_x.size(), stack_y.size());
        for (int i = 1; i <= size; i++) {
            //System.out.println(stack_x.pop() + " " + stack_y.pop());
            if (!stack_x.pop().equals(stack_y.pop())) {
                ans++;
            }

        }
        return ans;

    }

    //方法二：移位
    public static int hammingDistance2(int x, int y) {
        int sum = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                sum++;
            }
            //无符号右移1位，高位补0
            x = x >>> 1;
            y = y >>> 1;
        }
        return sum;
    }

}
