package basicPrograms;

import java.util.Scanner;

public class P03_FactorialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
	}

}
