package Leetcode;

import java.util.Arrays;

public class Leetcode217 {

	public static void main(String[] args) {
		int [] nums= {1,4,3,2,5};
	    System.out.println(Leetcode217.containsDuplicate(nums));
	}
	 public static boolean containsDuplicate(int[] nums) {
	     Arrays.parallelSort(nums); 
		 System.out.println(Arrays.toString(nums));
		 int len=nums.length;
		 for(int i=0;i<len-1;i++) {
			 if(nums[i]==nums[i+1])return true;
		 }
		 return false;
	    }
}
