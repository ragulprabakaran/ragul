package prime;
import java.util.Scanner;
public class prime {
	public static void main(String args[])
	{
		int no;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		no=in.nextInt();
        if(no>1)
		{
		for(int j=2;j<no;j++)
		{
			
			if(no%j!=0)
			{
				System.out.println("the given number is prime number");
				break;
			}
			else
			{
				System.out.println("the given number is not prime number");
			}
			break;
		}
	}
		if(no==1||no==0)
		{
			System.out.println("the given number is neither prime nor composite");
		}
		if(no=='\0')
		{
			System.out.println("Please enter the number");
			}
	}
	}




