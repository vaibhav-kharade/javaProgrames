class Leap_year {
	public static void main(String[] args) {
		int y1 = 2016;
		int y2 = 2019;
		if (2016 % 100 != 0 && 2016 % 4 == 0) {
			System.out.println(2016 + " is a Leap year");
		} else if (2019 % 100 != 0 && 2019 % 4 == 0) {
			System.out.println(2019 + " is a Leap year");
		} else {
			System.out.println("Entered year is not a Leap year");
		}
	}
}
