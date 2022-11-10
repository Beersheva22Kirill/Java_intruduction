package java_introduction;

import java.util.Arrays;

public class MyArrays {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return new array with added at end a given number
	 */
	public static int[] addsNumder (int[] array, int number) {
		int[] res = Arrays.copyOf(array, array.length + 1);	
		res[res.length - 1] = number;

		return res;
	}
	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at given index in a given array
	 * if index does not exist in a given array it return the same array  
	 */
	public static int[] removeNumber(int [] array, int index) {
		// use standard class System, method arraycopy
		int NumDigits = index >= 0 && index < array.length ? array.length - 1 : array.length;
		int[] res = new int[NumDigits];
		
		if (NumDigits == (array.length -1) ) {	
			System.arraycopy(array, 0, res, 0, index);
			System.arraycopy(array, index + 1, res, index, array.length - index - 1);
		} else {
			System.arraycopy(array, 0, res, 0, array.length );
		}

		return res;
		
	}
	/**
	 * 
	 * @param arraySorted - sorted array
	 * @param number
	 * @return new array with inserted number at index for keeping array sorted
	 */
	public static int [] insertSorted(int[] arraySorted, int number) {
		//use the method binarySearch of the standard class Arrays
		//use the method arraycopy of the standard class System
		int[] res = new int[arraySorted.length + 1];
		
		int posNumber = Arrays.binarySearch(arraySorted, number);		
		
		if (posNumber < 0) {
			posNumber = posNumber * (-1) - 1;  
		}		
			System.arraycopy(arraySorted, 0, res, 0, posNumber);
				res[posNumber] = number;
			System.arraycopy(arraySorted, posNumber, res, posNumber + 1, arraySorted.length - posNumber);	
		
		return res;
	}

}
