package Leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }

    //方法一：哈希
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        //要返回的答案
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        //将出现的数字进行保存
        for (int i = 0; i < len; i++) {
            //只记录一次不重复的数字到map
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        for (int i = 1; i <= len; i++) {
            //遍历1~len，如果map没有包含就添加
            if (!map.containsKey(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    //方法二：将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;
    }
}
