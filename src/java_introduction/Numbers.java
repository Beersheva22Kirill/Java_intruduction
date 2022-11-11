package java_introduction;

public class Numbers {

	static public int getNdigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;
		} while (number != 0);
		return res;
	}

	/**
	 * 
	 * @param number
	 * @return true only if number > 100000 and number < 999999 (6 digits) and sum
	 *         of first three digits equals the sum of last three digits
	 */
	static public boolean isHappyNumber(int number) {
		boolean res = false;
		if ((number >= 100000) && (number <= 999999)) {
			int digitRight = number % 1000;
			int digitLeft = (number / 1000);
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
	public static int sumDigit(int number) {
		int resSum = 0;
		while (number > 0) {
			resSum += number % 10;
			number /= 10;
		}
		return resSum;
	}

	public static int[] getDigits(int number) {
		int res[] = new int[getNdigits(number)];
		for (int i = res.length - 1; i >= 0; i--) {
			res[i] = number % 10;
			number /= 10;
		}
		return res;
	}

	public static int getNumberFromDigits(int[] digits) {

		int res = 0;
		for (int i = 0; i < digits.length; i++) {
			res = res * 10 + digits[i];
		}
		return res;
	}

	public static int getRandom(long min, long max) {
		// TODO getUniqRandom
		return (int) (min + Math.random() * (max - min + 1));
	}


// TODO
//	public static int getControlSum(int number) {	
//		
//		return sumEventIndexes(number) + sumOddIndexes(number);
//	}
//	

		
}