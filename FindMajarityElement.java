/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

 */


package HackerRank;

public class FindMajarityElement 
{
	
	    public int majorityElement(int[] ar) 
	    {
	    	int maj=ar[0];
	    	int count=1;
	    	for(int i=0;i<ar.length;i++) {
	    		if(ar[i]==maj) {
	    			count++;
	    		}else {
	    			count--;
	    		}
	    		if(count==0) {
	    			maj=ar[i];
	    			count=1;
	    		}
	    	}
	        return maj;
	    }
	public static void main(String[] args) 
	{  
		FindMajarityElement fme=new FindMajarityElement();
		int ar[]= {3,2,3,4};
		int nd=fme.majorityElement(ar);
		System.out.println(nd);
		
	}
}
