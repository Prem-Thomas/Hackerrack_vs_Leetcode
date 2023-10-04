package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Subarray {
public static int  birthday(ArrayList<Integer> s,int d,int m) 
{
	int count =0;
	for(int i=0;i<=s.size()-m;i++) {
		int sum=0;
		for(int j=i;j<i+m;j++) {
			sum=sum+s.get(j);
		}
		if(sum==d) {
			count++;
		}
	}
	return count;
	
}
	
	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		int m=2;
		int d=4;
		int sc=birthday(s, d, m);
		System.out.println(sc);
	}
}
