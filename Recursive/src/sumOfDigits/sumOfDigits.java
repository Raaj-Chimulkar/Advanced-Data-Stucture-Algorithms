package sumOfDigits;

import java.util.Scanner;

public class sumOfDigits {

	
	public static int recursive(int n) {
		if(n==0) {
			return 0;
		}
		return  n%10 +recursive(n/10);
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Lets find the sum of digits of a Number!!*****");
		System.out.println("Enter the number ::");
		int num =sc.nextInt();
		int sum=0;
		
		System.out.println("Sum of digits of "+num+ "::"+recursive(num));
	}
}
