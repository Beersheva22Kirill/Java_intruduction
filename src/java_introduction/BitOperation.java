package java_introduction;

/**
 * right nBit value [0, 63]
 * All method will return -1 in the case of wrong nBit value
 *
 */

public class BitOperation {
	
	
	private static final int N_BITS = 64;

	/**
	 * 
	 * @param number - any number
	 * @param nBit - number of bit
	 * @return value of bit with number nBit
	 */
private static boolean checkNbit(int nBit) {
		
		return nBit < N_BITS && nBit > -1;
}
	
	static public int getBitValue (long number, int nBit) {
		int res = -1;
		if (checkNbit(nBit)) {
			long mask = getMask(nBit); //all bits re 0 except bit with number nBit
			res = (number & mask) == 0 ? 0 : 1;
		}	
			return res;	
		}

	private static long getMask(int nBit) {

		return 1l << nBit;
		
	}	
		
		
		/**
		 * 
		 * @param number - any number
		 * @param nBit - number of bit
		 * @param Value - flag
		 * @return
		 */
		
		static public long setBitValue(long number, int nBit, boolean value) {
//			if (!value) {
//			if (checkNbit(nBit)) {
//				long mask = 1 << nBit; //all bits re 0 exept bit with number nBit
//					System.out.println(Long.toBinaryString(mask));
//				if (getBitValue(number, nBit) == 1) {
//					System.out.println(Long.toBinaryString(number));
//					number = number^mask;
//					System.out.println(Long.toBinaryString(number));
//				}
//			}
//			}
			
			
			long res = -1;
			
			if (checkNbit(nBit)) {
				long mask = getMask(nBit);
				res = value ? number | mask : number & ~mask;

			}
			return res;	
			}
					
		
		/**
		 * 
		 * @param number - any number
		 * @param nBit - number of bit 
		 * @return
		 */
		static public long invertBitValue(long number, int  nBit) {
			long res = -1; 
			
			if (checkNbit(nBit)) {
				long mask = 1 << nBit; //all bits re 0 exept bit with number nBit
				res = number^mask;
			}
			return res;	
		}
		
		// -------------lesson 03_11_2022-------------
		
		static public int leadingZeros(long number) {
			int res = 0;
			int nBit = N_BITS-1;
			while(nBit >= 0 && getBitValue(number, nBit) == 0) {
				 res++;
				 nBit--;
				
			}
			return res;
		}
		
		static public int onesInNumber(long number) {
			int res = 0;
			int nBit = N_BITS-1;
			
			for (int i = 0; i < nBit; i++) {
				if (getBitValue(number, i) == 1) {
					res++;
				}
			}
			return res;
		}
		
}
