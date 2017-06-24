



public class Prime3 {
public static void main(String args[])
{
	int no;
	System.out.println("The Prime number between 10 to 99 is ");
	for(no=10;no<=99;no++)
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



