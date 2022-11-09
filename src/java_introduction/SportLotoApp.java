package java_introduction;

//import org.w3c.dom.css.Counter;

public class SportLotoApp {

	/**
	 * 
	 * Application displays out 6 random numbers from 1 to 49
	 * numbers can not be repeated in a sequence of 6 random numbers
	 * no additional collections / arrays
	 */
 

	public static void main(String[] args) {	
		
		int ar[] = {1,2,3};
		int ar1[] = new int[3];
		final int ar2[] = new int[3];
		
		for (int i = 0; i < 3; i++) {
			
		}		
		int  dif = 0, i = 0;
		int iterCounter = 0; //iteration counter
		long indicatNumber = 0l; 
		while (i < 6) {
			dif = Numbers.getRandom(1, 49);
			if (BitOperation.getBitValue(indicatNumber, dif) == 0) {
				System.out.print(dif + " ");
				i++;	
				indicatNumber = BitOperation.invertBitValue(indicatNumber, dif);	
			}
			iterCounter++;	
		}

		
	}
	


}
