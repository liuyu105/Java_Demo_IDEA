package Leetcode;

import java.util.Arrays;

public class Leetcode137 {

	public static void main(String[] args) {

		int [] nums= {1,2,2,4,4,3,5,3,5};
		System.out.println(singleNumber(nums));
	}
	 public static int singleNumber(int[] nums) {
	        int len=nums.length;
	        Arrays.sort(nums);
	        if(nums[0]!=nums[1]) {
	        	return nums[0];
	        }
	        if(nums[len-2]!=nums[len-1]) return nums[len-1];
	        for(int i=1;i<len-1;i++) {
	        	if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]) {
	        		return nums[i];	        		
	        	}
	        }
	        return 0;
	    }
}
