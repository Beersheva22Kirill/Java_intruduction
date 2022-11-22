package java_introduction;

public class Strings {
	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if "str" anagram of "anagram"
	 */
	public static boolean isAnagram(String str , String anagram) {
		boolean res = true;
		char[] arrayCharStr = str.toCharArray();
		char[] arrayCharAnagram = anagram.toCharArray();
		int[] helper = new int [maxCharElement(arrayCharStr) + 1];
		
		if (arrayCharStr.length == arrayCharAnagram.length) {
			for (int i = 0; i < arrayCharStr.length; i++) {	
				helper[arrayCharStr[i]] += 1; 			
			}
			for (int i = 0; i < arrayCharAnagram.length; i++) {
				
				if (helper[(int)arrayCharAnagram[i]] > 0)  {
					helper[(int)arrayCharAnagram[i]]--;
				} else {
					res = false;
				}
			}
		} else {
			res = false;
		}
		
		return res;
		
	}
	/**
	 * 
	 * @param array
	 * @return max number value of array character
	 */
	public static int maxCharElement (char array[]) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			if (res < (int)array[i]) {
				res = (int)array[i];
			}
		}		
		return res;
	}
	
	public static void sortStringNumbers (String[] arrayStr ) {
		
		int [] helper = new int [Byte.MAX_VALUE + (-Byte.MIN_VALUE) + 1];
		for (int i = 0; i < arrayStr.length; i++) {
			int index = (int) (Byte.parseByte(arrayStr[i]) + (-Byte.MIN_VALUE));
				helper[index] += 1;				
		}
		int i = 0;
		int indexForRes = 0;
		while(i < helper.length) {
			if (helper[i] != 0) {
				for (int j = 0; j < helper[i]; j++) {
					arrayStr[indexForRes ++] = Integer.toString(i - (-Byte.MIN_VALUE));
				}				
			}			
		i++;		
		}		
	}
	
	public static String javaNameExp() {
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}
	
	public static String ipV4Octet() {

		return "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
	}
	
	public static String ipV4() {
		String begin = ipV4Octet().replaceAll("[\\$]", "");
		String end = ipV4Octet().replaceAll("[\\^]", "");
		String middle = ipV4Octet().replaceAll("[\\^\\$]", "");
		
		return begin + "\\." + middle + "\\." + middle + "\\." + end;
	}
	
}
