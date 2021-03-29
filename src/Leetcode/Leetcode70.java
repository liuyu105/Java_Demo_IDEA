package Leetcode;

public class Leetcode70 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    //方法一：动态规划
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i <= n; i++) f[i] = f[i - 1] + f[i - 2];
        return f[n];
    }
}
