


import java.util.Scanner;
public class Prime3 {
public static void main(String args[])
{
	int no;
	int a,b;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	System.out.println("The Prime number between 10 to 99 is ");
	for(no=a;no<=b;no++)
	{boolean isPrime=true;
		for(int j=2;j<no;j++)
	{
		
		if(no%j==0)
		{isPrime=false;
		break;
		}}
		if(isPrime)
		{
			System.out.print(no+" , ");
		}
	}
}
}



