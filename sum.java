package leapyear;

import java.util.Scanner;

public class sum {
	 public static void main(String[] args) {
	        int n ;
	        Scanner in =new Scanner(System.in);
	        System.out.println("Enter the number");
	        n=in.nextInt();
	        int sum = 0;
	        n = n * (n + 1) / 2;// calculate the sum N number
	        for (int i = 0; i <= n; i++) {
	            sum = sum + i;// calculate sum of i
	            // display the vslue of sum
	        }
	        System.out.println("sum:" + sum);
	    }
}
