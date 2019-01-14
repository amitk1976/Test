package stringTesting;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		double i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		i = sc.nextInt();
		System.out.println("You have entered : " + i);
		// double c = i % 2;
		double b = Math.round(i / 2);
		int flag = 0;

		for (int k = 2; k <= b; k++) {
			if (i % k == 0) {
				System.out.println("The number is not prime");
				flag = 1;
				break;

			}
		}
		if (flag == 0)
			System.out.println("The number is prime");

	}
}
