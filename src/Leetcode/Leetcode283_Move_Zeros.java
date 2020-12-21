package Leetcode;

import java.util.Arrays;

public class Leetcode283_Move_Zeros {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 3, 12};
        Leetcode283_Move_Zeros.moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //方法一：暴力遍历
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        //记录0的个数
        int num = 0;
        //i+1<len 保证没有溢出数组
        for (int i = 0; i < len - num && i + 1 < len; i++) {
            //如果遍历的数为0，先判断下一位是否还是0
            if (nums[i] == 0) {
                //若是0，移位后需保证指针未移动。
                if (nums[i + 1] == 0) {
                    for (int j = i + 1; j < len - num; j++) {
                        nums[j - 1] = nums[j];
                    }
                    i--;
                } else {
                    for (int j = i + 1; j < len - num; j++) {
                        nums[j - 1] = nums[j];
                    }
                }
                //数值为0的索引+1
                num++;
            }

        }
        //对num个0进行赋值
        for (int i = len - num; i < len; i++) {
            nums[i] = 0;
        }
    }

    //方法二：技巧解法
    public static void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }

}
