package leapyear;

import java.util.Scanner;

public class year {
	public static void main(String args[]){
int a;
Scanner in=new Scanner(System.in);
System.out.println("Enter the year");
a=in.nextInt();
if((a%4==0)||(a%400==0)&&(a%100!=0)){
	System.out.println("The given year is Leap year");
}
else{
	System.out.println("The given year is not an leap year");
}
}
}