package leapyear;

import java.util.Scanner;

public class Digits {
	public static void main(String args[])
	{
		int no,mo,bo=0,ko;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		no=in.nextInt();
		ko=no;
		for(;no>0;)
		{
			if(no>0)
			{
				mo=no%10;
				bo=bo+1;
				no=no/10;
				
			}
			
		}
		System.out.println("The number of digits in number "+ko+" is "+bo);
	}
}
