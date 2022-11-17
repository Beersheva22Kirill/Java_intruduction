package java_introduction;

public class Strings {
	/**
	 * 
	 * @param str
	 * @param anagramm
	 * @return true if str anagramm of "anagramm"
	 */
	public static boolean isAnagramm(String str , String anagramm) {
		//TODO
		boolean res = true;
		char[] arrayCharStr = str.toCharArray();
		char[] arrayCharAnagramm = anagramm.toCharArray();
		int[] helper = new int [maxCharElement(arrayCharStr) + 1];
		
		if (arrayCharStr.length == arrayCharAnagramm.length) {
			for (int i = 0; i < arrayCharStr.length; i++) {	
				helper[arrayCharStr[i]] += 1; 			
			}
			for (int i = 0; i < arrayCharAnagramm.length; i++) {
				
				if (helper[(int)arrayCharAnagramm[i]] > 0)  {
					helper[(int)arrayCharAnagramm[i]]--;
				} else {
					res = false;
				}
			}
		} else {
			res = false;
		}
		
		return res;
		
	}
	
	public static int maxCharElement (char array[]) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			if (res < (int)array[i]) {
				res = (int)array[i];
			}
		}		
		return res;
	}

}
