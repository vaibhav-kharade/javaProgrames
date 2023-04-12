import javax.lang.model.util.ElementScanner6;

class Switch_Even_Odd_Greatest_Smallest {
	public static void main(String[] args) {
		int a = 40;
		int b = 41;
		int vaibhav = 1;
		switch (vaibhav) {
			case 1:
				if (a % 2 == 0 && b % 2 == 0) {
					System.out.println("Both are even numbers");
				} else {
					System.out.println("Both are not an even numbers");
				}

			case 2:
				if (a % 2 != 0 && b % 2 != 0) {

					System.out.println("Both are odd numbers");
				} else {
					System.out.println("Both are not an odd numbers");
				}

			case 3:
				if (a > b) {
					System.out.println(a + " is a greatest number");
				} else {
					System.out.println(a + " is not a greatest number");
				}

			case 4:
				if (a < b) {
					System.out.println(a + " is smallest number");
				} else {
					System.out.println(a + " is not a smallest number");
				}

		}
	}
}
