package java_introduction;

public class Numbers {
	
	static public int getNDigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;
		} while(number != 0);
		return res;
	}

	/**
	 * 
	 * @param number
	 * @return true only if number > 100000 and number < 999999 (6 digits)
	 * and sum of first three digits equals the sum of last three digits
 	 */
	static public boolean isHappyNumber (int number) {
		boolean res = false;
		if ((number >= 100000) && (number <= 999999)) { 
			int digitRight = number % 1000;
			int digitLeft = (number/1000) % 1000;
			if (sumDigit(digitLeft) == sumDigit(digitRight)) {
				res = true;
				System.out.println("Number " + number + " is happy number");
				} else {
					System.out.println("Number " + number + " is not happy number");
				}
		}			
			return res;
	}
		
	
/**
 * 	
 * @param number 
 * @return sum digits of number
 */
public static int sumDigit (int number) {
	int resSum = 0;
	while (number > 0) {
		resSum += number % 10;
		number /= 10;
	}
	return resSum;
}	
}