package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = Leetcode1_Two_Sum.twoSum2(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    //暴力枚举
    public static int[] twoSum(int[] nums, int target) {
        //结果数组有两位
        int[] result = new int[2];
        //将每个数与后面的数都做一个比较
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //找到符合条件的数对应的索引
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    //哈希表
    public static int[] twoSum2(int[] nums, int target) {
        //建立一个哈希映射，存放数值与对应的索引
        Map<Integer, Integer> map = new HashMap<>();
        //遍历nums数组
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            //如果没有包含满足条件的数值，便添加至哈希表中
            map.put(nums[i], i);
        }
        return new int[0];

    }
}
