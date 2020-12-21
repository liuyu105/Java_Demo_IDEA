package Leetcode;

import java.util.Arrays;

public class Leetcode189 {

	public static void main(String[] args) {
		int []nums= {1,2,3,4,6};
		rotate(nums,3);
		System.out.println(Arrays.toString(nums));

	}
	
	
	/**
	 * ����һ
	 * ���ƶ�һ�Σ�ѭ������
	 * @param nums ������
	 * @param k ���Ƶ�λ��
	 */
//	 public static void rotate(int[] nums, int k) {
//	       int len=nums.length;
//	       for(int i=0;i<k;i++) {
//	    	   int a=nums[0];
//	    	   nums[0]=nums[len-1];
//	    	   int j=len-2;
//	    	   while(j>0) {
//	    		   nums[j+1]=nums[j];
//	    		   j--;
//	    	   }
//	    	   nums[j+1]=a;
//	       }
//	 }
	 
	/** 
	 * ������
	 * @param nums
	 * @param k
	 */
	 public static void rotate(int[] nums, int k) {
	       int len=nums.length;
	  
	    	   int a=nums[k-1];
	    	   nums[k-1]=nums[len-1];
	    	   int j=len-k-1;
	    	   while(j>=0) {
	    		   if((j+k)%len!=0) {
	    			   nums[(j+k)%len]=nums[j];
	    		   }
	    		   else nums[len-1]=nums[j];
	    		   
	    		   j=j-k;
	    	   }
	    	   nums[(2*k-1)%len]=a;
	       
	 }
}
