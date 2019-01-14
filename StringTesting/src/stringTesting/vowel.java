package stringTesting;

import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		String V = ("AIOUE");
		char a;
		Scanner S = new Scanner(System.in);

		System.out.println("Enter a character");
		a = S.next().charAt(0);
		

		// System.out.println("You have entered : " + a);

		for (int i = 0; i < V.length(); i++) {
			// System.out.println(V.charAt(i));
			if ((V.charAt(i) == a)) {

				System.out.println("You have entered a Vowel : " + a);
				break;
			}
		}
		System.out.println("You have not entred a VOwel");
	}
}
