package stringTesting;

public class CalculateDay {
	public static void main(String[] args) {
		// Date d = new Date();

		String day = "WED";
		// String needed = "SAT";

		for (int i = 0; i <= 7; i++) {
			if ("SAT".equals(day)) {
				System.out.println("I am true");
				break;

			} else {
				System.out.println("I am false");
				day = "SAT";
			}
		}
	}

}
