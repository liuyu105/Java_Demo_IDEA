package Leetcode;

public class Leetcode26 {
    public static void main(String[] args) {
        Leetcode26 lt = new Leetcode26();
        int[] nums = {1, 2, 2, 3};
        System.out.println(lt.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 0; // 计算无重复个数
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}
