package array2;

public class array2 {
public static void main(String args[])
{
	int x[]=new int[3];
        int xlen=x.length;
	Scanner ab=new Scanner(System.in);
	for(int i=0;i<xlen;i++){
		x[i]=ab.nextInt();
		}	
	int a=x[0],b=x[0];
	for(int i=0;i<xlen;i++)
	{
		if(a<=x[i])
		{
			a=x[i];
		}
		if(b>x[i])
		{
			b=x[i];
		}
	}
	System.out.println("The max and min no in the array is "+a+" & "+b);
}
}
