package java_introduction;

/**
 * right nBit value [0, 63]
 * All method will return -1 in the case of wrong nBit value
 *
 */

public class BitOperation {
	
//	@param number - any number
//	@param nBit - number of bit
//	@return value of bit with number nBit
//  @param value true for 1, false for 0
//	@return number in witch value of			
		
	
	/**
	 * 
	 * @param number - any number
	 * @param nBit - number of bit
	 * @return value of bit with number nBit
	 */
	
	static public int getBitValue (long number, int nBit) {
		int res = -1;
		if (checkNbit(nBit)) {
			long mask = 1 << nBit; //all bits re 0 exept bit with number nBit
			if ((number & mask) == 0) {
				res = 0;
			} else {
				res = 1;
			}
		}
		
		
			return res;	
		}	
	private static boolean checkNbit(int nBit) {
		
		return nBit < 64 && nBit > -1;
	}	
		
		/**
		 * 
		 * @param number
		 * @param nBit
		 * @param Value
		 * @return
		 */
		
		static public long setBitValue(long number, int nBit, boolean value) {
			
			return Value;
			
		}		
		
		/**
		 * 
		 * @param number - any number
		 * @param nBit - 
		 * @param value
		 * @return
		 */
		static public long revertBitValue(long number, int  nBit) {
		
			return -1;	
		}
		
}
