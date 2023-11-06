package factorial;

import java.util.Scanner;

public class factorial {

	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Lets find the factorial of a Number!!*****");
		System.out.println("Enter the number ::");
		long num = sc.nextLong();

		System.out.println("Factorial of " + num + "::" + factorial(num));
	}
}
