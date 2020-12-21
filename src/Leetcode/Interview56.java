package Leetcode;

/*
面试题56 - I. 数组中数字出现的次数

一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。
要求时间复杂度是O(n)，空间复杂度是O(1)。

示例 1：
输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]

 */
public class Interview56 {
    public static void main(String[] args) {
        Interview56 lt = new Interview56();
        int[] nums = {1, 2, 2, 3};
        int[] a = lt.singleNumbers(nums);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public int[] singleNumbers(int[] nums) {
        int length = nums.length;
        int sum = 0; //所有异或的结果，即为两个不等元素的异或值
        for (int i : nums) {
            sum ^= i;
        }

        //两个不等元素必然在某位上不一致，所以依照这种方式对元素进行分组
        int div = 1;
        //找sum中最低位为1的位置
        while ((sum & div) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((n & div) == 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}
