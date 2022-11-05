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
		
	
		int  dif = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, i = 1;
		int iterCounter = 0; //iteration counter
		do { 
			dif = getRandom(1, 49);

			if (i==1) {
				System.out.print(dif + " ");
				num1 = dif;
				i++;
			}
			
			if (i==2) {
				if (dif != num1) {
					num2 = dif;
					System.out.print(dif + " ");
					i++;
				}	
			} 
			
			if (i==3) {
				if(dif != num1 && dif != num2) {
					num3 = dif;
					System.out.print(dif + " ");
					i++;
				}	
			}
			if (i==4) {
				if(dif != num1 && dif != num2 && dif != num3) {
					num4 = dif;
					System.out.print(dif + " ");
					i++;
				}	
			}
			
			if (i==5) {
				if (dif != num1 && dif != num2 && dif != num3 && dif != num4) {
					num5 = dif;
					System.out.print(dif + " ");
					i++;
				}	
			}
			if (i==6) {
				if (dif != num1 && dif != num2 && dif != num3 && dif != num4 && dif != num5) {
					num6 = dif;
					System.out.print(dif + " ");
					i++;
				}
			}
			iterCounter++;
		} while (i <= 6);
		System.out.println();
		System.out.println(iterCounter); 
		

		
//		for (int i = 1; i <= 6; i++) {
//		    System.out.print(getRandom(1, 49)+ " ");
			
		
			// ввести проверку на повторение значений. Все значения должны быть уникальными


	}
	
	public static int getRandom(int min, int max) {
		
		return (int) (min + Math.random() * (max - min +1));
	}

}
