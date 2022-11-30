package telran.digital.numbers;

public class DigitalNumbersPrinting {

	private static final String SYMBOL = "*";

	public static void displayDigitalNumder(int number, int offset, int width, int height) {
		int[] array = getDigits(number);
		String[] res = new String[height];
		String[] strArrForConcat = new String [height];
		for (int i = 0; i < array.length; i++) {
			strArrForConcat = getSymbolDigit(array[i], offset, width, height);
			for (int j = 0; j < res.length; j++) {
				res[j] = concatenationString(res[j], strArrForConcat[j]);
			}

		}
		displayStrings(res);
	}

	private static String concatenationString(String stringRes, String stringForConcat) {

		return stringRes == null ? stringRes = stringForConcat : stringRes + " " + stringForConcat;
	}

	private static String[] getSymbolDigit(int digit, int offset, int width, int height) {
		String[] res = new String[height];
		switch (digit) {
		case 0:
			res = zero(offset, width, height);	break;
		case 1:
			res = one(offset, width, height);	break;
		case 2:
			res = two(offset, width, height);	break;
		case 3:
			res = thee(offset, width, height);	break;
		case 4:
			res = four(offset, width, height);	break;
		case 5:
			res = five(offset, width, height);	break;
		case 6:
			res = six(offset, width, height);	break;
		case 7:
			res = seven(offset, width, height);	break;
		case 8:
			res = eight(offset, width, height);	break;
		case 9:
			res = nine(offset, width, height);	break;
		default:
			break;
		}

		return res;
	}

	public static String line(int offset, int length) {
		return " ".repeat(offset) + SYMBOL.repeat(length);
	}

	public static String[] verticalLine(int offset, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL;
		}
		return res;
	}

	public static String[] twoVerticalLines(int offset, int width, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 2) + SYMBOL;
		}
		return res;
	}

	public static String[] zero(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height - 2);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static String[] one(int offset, int width, int height) {
		return verticalLine(offset + width - 1, height);
	}

	public static String[] two(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLine = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(verticalLine, 0, res, 1, verticalLine.length);
		res[height / 2] = line(offset, width);
		String[] verticalLineTwo = verticalLine(offset, height / 2 - 1);
			for (int i = 0; i < verticalLineTwo.length; i++) {
				verticalLineTwo[i] += " ".repeat(width - 1);
			}
		System.arraycopy(verticalLineTwo, 0, res, height / 2 + 1, verticalLineTwo.length);
		res[height - 1] = line(offset, width);
		return res;
	}
	
	public static String[] thee(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLine = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(verticalLine, 0, res, 1, verticalLine.length);
		res[height / 2] = line(offset, width);
		System.arraycopy(verticalLine, 0, res, height / 2 + 1, verticalLine.length);
		res[height - 1] = line(offset, width);
		return res;
	}
	
	public static String[] four(int offset, int width, int height) {
		String[] res = new String[height];		
		res[height/2] = line(offset, width);
		String[] verticalLineOne = twoVerticalLines(offset, width, height/2);
		System.arraycopy(verticalLineOne, 0, res, 0, verticalLineOne.length);
		String[] verticalLineTwo = verticalLine(offset + width - 1, height % 2 == 0 ? height/2 - 1 : height/2);
		System.arraycopy(verticalLineTwo, 0, res, height/2+1, verticalLineTwo.length);
		return res;
	}
	
	public static String[] five(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLineOne = verticalLine(offset, height / 2 - 1);
			for (int i = 0; i < verticalLineOne.length; i++) {
				verticalLineOne[i] += " ".repeat(width - 1);
			}
		System.arraycopy(verticalLineOne, 0, res, 1, verticalLineOne.length);
		res[height / 2] = line(offset, width);
		String[] verticalLineTwo = verticalLine(offset+width-1, height / 2 - 1);
		System.arraycopy(verticalLineTwo, 0, res, height / 2 + 1, verticalLineTwo.length);
		res[height - 1] = line(offset, width);
		return res;
	}
	
	public static String[] six(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLineOne = verticalLine(offset, height / 2 - 1);
			for (int i = 0; i < verticalLineOne.length; i++) {
				verticalLineOne[i] += " ".repeat(width - 1);
			}
		System.arraycopy(verticalLineOne, 0, res, 1, verticalLineOne.length);
		res[height / 2] = line(offset, width);
		String[] verticalLineTwo = twoVerticalLines(offset, width, height/2);
		System.arraycopy(verticalLineTwo, 0, res, height / 2 + 1, verticalLineTwo.length - 1);
		res[height - 1] = line(offset, width);
		return res;
	}
	
	public static String[] seven(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLineOne = verticalLine(offset + width - 1, height -1);
		System.arraycopy(verticalLineOne, 0, res, 1, verticalLineOne.length);
		
		return res;
	}
	
	public static String[] eight(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLineOne = twoVerticalLines(offset, width, height/2 - 1);
		System.arraycopy(verticalLineOne, 0, res, 1, verticalLineOne.length);
		res[height / 2] = line(offset, width);
		String[] verticalLineTwo = twoVerticalLines(offset, width, height % 2 == 0 ? height/2 - 1 : height/2);
		System.arraycopy(verticalLineTwo, 0, res, height / 2 + 1, verticalLineTwo.length);
		res[height - 1] = line(offset, width);
		return res;
	}
	
	public static String[] nine(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] verticalLineOne = twoVerticalLines(offset, width, height/2 - 1);
		System.arraycopy(verticalLineOne, 0, res, 1, verticalLineOne.length);
		res[height / 2] = line(offset, width);
		String[] verticalLineTwo = verticalLine(offset+width-1, height % 2 == 0 ? height/2 - 1 : height/2);
		System.arraycopy(verticalLineTwo, 0, res, height / 2 + 1, verticalLineTwo.length);
		return res;
	}

	public static void displayStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	public static int[] getDigits(int number) {
		int res[] = new int[getNdigits(number)];
		for (int i = res.length - 1; i >= 0; i--) {
			res[i] = number % 10;
			number /= 10;
		}
		return res;
	}

	public static int getNdigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;
		} while (number != 0);
		return res;
	}

}
