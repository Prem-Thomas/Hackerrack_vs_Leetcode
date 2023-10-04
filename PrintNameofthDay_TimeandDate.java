package HackerRank;

import java.util.Scanner;

public class PrintNameofthDay_TimeandDate {
       int dd;
       int mm;
       int yy;
       int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
       String[] Dname= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATUREDAY"};
       String[] Mname= {"","Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
       public PrintNameofthDay_TimeandDate(int dd,int mm,int yy) {
    	   this.dd=dd;
    	   this.mm=mm;
    	   this.yy=yy;
    	   if((yy%4==0&&yy%100!=0)||yy%400==0) {
    		   month[2]=29;
    	   }
    	   
       }
       int noofDays() {
    	   int days=0;
    	   int y=yy-1;
    	   days=days+y*365;
    	   days=days+y/4-y/100+y/400;
    	   for (int i = 1; i < mm; i++) {
    		   days=days+month[i];
		}
    	   days=days+dd;
    	   return days;
       }
       public String toString() {
    	   return dd+"/ "+mm+" / "+yy;
       }
       public String dayName() {
    	   int ct=noofDays();
    	   return Dname[ct%7];
       }
       public String MonthName() {
    	   return Mname[mm];
       }
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the date");
    	   int d1=sc.nextInt();
    	   System.out.println("Enter the month");
    	   int m1=sc.nextInt();
    	   System.out.println("Enter the year");
    	   int y1=sc.nextInt();
    	   PrintNameofthDay_TimeandDate dt1=new PrintNameofthDay_TimeandDate(d1,m1,y1);
    	   System.out.println("Day Name :"+dt1.dayName());
       }
}
