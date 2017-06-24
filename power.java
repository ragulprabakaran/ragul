package test;

import java.util.Scanner;

public class power {
	public static void main(String arg[])	
	  {
	    int n,p,result=1;
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the number");
	    n=in.nextInt();
	    System.out.println("Enter the order of the power :");
	    p=in.nextInt();
	    if(n>=0&&p==0)
	     {
	        result=1;
	     }
	    else if(n==0&&p>=1)
	      { 
	         result=0;
	      }
	    else
	     {
	         for(int i=1;i<=p;i++)
		 {
	            result=result*n;
	 	 }	    
	     }
	    System.out.println(n+"^"+p+"="+result);
		
	  }
}
