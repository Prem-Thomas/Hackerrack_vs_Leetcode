/*  Hackerrank :-
 * ------------
 * There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.

Example


The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Returns

int: the frequency of a in the substring
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Sample Input

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
Explanation 1
Because all of the first n=1000000000000  letters of the infinite string are a, we return 1000000000000 .


 */




package HackerRank;

import java.util.Scanner;

public class RepeatedString 
{
	public static long repeatedString(String s,long n) 
	{
		long countA=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				countA++;
			}
		}
		countA=countA*(n/s.length());
		for(int i=0;i<(n%s.length());i++) {
			if(s.charAt(i)=='a') {
				countA++;
			}
		}
		return countA;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long n=sc.nextInt();
		long nc=repeatedString(s, n);
		System.out.println(nc);
		
	}

}
