/*
 * An integer  is a divisor of an integer  if the remainder of .

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example

Check whether ,  and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether , , and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether  and  are divisors of .  is, but  is not. Return .

Function Description

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

int n: the value to analyze
Returns

int: the number of digits in  that are divisors of 
Input Format

The first line is an integer, , the number of test cases.
The  subsequent lines each contain an integer, .

Constraints



Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number 12 is broken into two digits, 1 and 2. When 12 is divided by either of those two digits, the remainder is 0 so they are both divisors.

The number 1012 is broken into four digits, 1, 0,1 , and 2. 1012  is evenly divisible by its digits 1,0 ,1 and 2, but it is not divisible by 0 as division by zero is undefined.


 */

package HackerRank;

public class FindDigit {
	 public static int findDigits(int n) {
		    // Write your code here
		 // Note In Hackerrank or leetcode problem we are write only  side the method body without main Method.
		    int count=0;
		    int temp=n;
		   while(temp>0)
		   {
		       int r=temp%10;
		       if(r!=0){
		           if(n%r==0){
		           count++;
		       }
		       }
		       
		       temp=temp/10;       
		   }

		 return count;
		    }
	 public static void main(String[] args) {
		int n=124;
		int x=1012;
		int y=12;
		int sc=findDigits(n);
		System.out.println(sc);
		System.out.println(findDigits(x));
		System.out.println(findDigits(y));
	}
}
