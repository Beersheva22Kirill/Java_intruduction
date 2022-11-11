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
		if (NumDigits == (array.length - 1) ) {	
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
		
		return res; //insertAtIndex(arraySorted,number,posNumber);
	}
	
	private static int[] insertAtIndex(int[] array, int number, int index) {
		int res[] = new int[array.length];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		
		return res;
	}
	/**
	 * 
	 * @param arraySorted
	 * @param number
	 * @return index value if number exist otherwise
	 * 0[N] - search number in unsorted array
	 * 0[logN] - search number in sorted (binary search)
	 * 
	 */
	public static int binarySearchFirstIndex(int arraySorted[], int number) {
		
		int indexLeft = 0, indexRight = arraySorted.length - 1;
		int middle = 0;
		
		boolean flag = true;
		
while (flag == true) {	
		middle = indexRight / 2;
		while (indexLeft <= indexRight && arraySorted[middle] != number ) {
			if (number < arraySorted[middle]) {
				indexRight = middle - 1;
			} else {
				indexLeft = middle + 1;
			}
			middle = (indexLeft + indexRight) / 2;
		}
		
		if (elementBefore(arraySorted, middle) == true) {
			indexRight = middle - 1;
		} else {
			flag = false;
		}
			
		
	}
		return indexLeft>indexRight ? -1 : middle;
	}
	
	public static boolean arrOneStepToSort(int array[]) {
		int counter = 0, i = 0;
		while (counter < 2 && i < array.length - 1) {
			if (array[i] > array[i+1]) {
				counter++;				
			}
			i++;
		}		
		return counter == 1 ? true : false;
	}
	

	
	public static int[] bubleSortArr(int [] array) {
		
		int [] arraySort = array;
		boolean arrSort = false;
		while (!arrSort) {
			arrSort = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					arrSort = false;
					
					int tempElement = array[i];
					arraySort[i] = array[i + 1];
					arraySort[i + 1] = tempElement;
				}
			}
			
		}
		printArr(arraySort);
		return array;
	}

	public static void printArr(int [] array) {
			System.out.println();
		for (int i = 0; i < array.length; i++) {			
			System.out.print(array[i]);
		}
			System.out.println();
	}
	/**
	 * 
	 * @param array
	 * @return sum of even numbers
	 */
	public static int sumEventIndexes(int[] array) {	
		int res = 0;
		for (int i = 0; i < array.length; i += 2 ) {
			res += array[i];
		}
		return res;
	}
	
	/**
	 * 
	 * @param array
	 * @return sum of odd numbers
	 */
	public static int sumOddIndexes(int[] array) {	
		int res = 0;
		int digit = 0;
		for (int i = 1; i < array.length; i += 2 ) {
			digit = array[i] * 2;
			if (digit > 9) {
				digit = Numbers.sumDigit(digit);				
			}
			res += digit; 
		}
		return res;
	}
	
	public static int getControlSum(int[] number) {
		
		return sumEventIndexes(number) + sumOddIndexes(number);
		
	}
	/**
	 * 
	 * @param array
	 * @param index
	 * @return true if the previous element is equal to the current
	 */
	public static boolean elementBefore (int[] array, int index) {

		return array[index] == array[index - 1] ? true : false;		
	}
}
