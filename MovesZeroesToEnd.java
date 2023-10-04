/*
 * LeetCode #283 Problem
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */
package HackerRank;

import java.util.Scanner;

public class MovesZeroesToEnd {
	 public static void moveZeroes(int[] nums) {
	 int size=nums.length;
	 if(size==0||size==1) {
		 return;
	 }
	 int nz=0,n=0;
	 while(nz<size) {
		 if(nums[nz]!=0) {
			 int temp=nums[nz];
			 nums[nz]=nums[n];
			 nums[n]=temp;
			 nz++;
			 n++;
		 }else {
			 nz++;
		 }
	 }
	 }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value :");
	int n=sc.nextInt();
	int nums[]=new int[n];
	for(int i=0;i<nums.length;i++) {
		nums[i]=sc.nextInt();
	}
	MovesZeroesToEnd mze=new MovesZeroesToEnd();
	mze.moveZeroes(nums);
	for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i]+" ");
	}
}
}
