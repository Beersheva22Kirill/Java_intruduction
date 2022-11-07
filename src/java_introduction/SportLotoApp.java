package java_introduction;

import org.w3c.dom.css.Counter;

public class SportLotoApp {

	/**
	 * 
	 * Application displays out 6 random numbers from 1 to 49
	 * numbers can not be repeated in a sequence of 6 random numbers
	 * no additional collections / arrays
	 */
	public static void main(String[] args) {
		
		int  dif = 0, i = 0;
		int iterCounter = 0; //iteration counter
		long indicatNumber = 0; 
		
		while (i < 6) {
			dif = getRandom(1, 49);
			if (BitOperation.getBitValue(indicatNumber, dif) == 0) {
				System.out.print(dif + " ");
				i++;	
				indicatNumber = BitOperation.invertBitValue(indicatNumber, dif);	
			}
			iterCounter++;	
		}
		
		System.out.println();
		System.out.println(iterCounter);
		System.out.println(Long.toBinaryString(indicatNumber));

		
	}
	
	public static int getRandom(int min, int max) {
		
		return (int) (min + Math.random() * (max - min +1));
	}

}
