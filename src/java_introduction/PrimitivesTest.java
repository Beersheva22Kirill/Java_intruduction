package java_introduction;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Test
	@Disabled
	void dataTypeTest() {

		int b = 10;
		short a = 2000;
		char c = 'd';

		long l = (long) 10.1;
		byte b1 = (byte) 1000;
		a = (short) l;

		float fl = 10.2f;
		int b2 = 0xfffffff6;

		assertEquals(-10, b2);

	}

	@Test
	@Disabled
	void operatorTest() {

		int a = 10;

		assertEquals(13, a + 3);
		assertEquals(1, a % 3);

		int number = 123;
		
		System.out.println(number);

//		int num = 345;

//     Цикл разбора числа на составляющие цифры		
		
//		for (int i = 1; num > 0; i++) {
//
//			int difer = num % (int) Math.pow(10, i);
//
//			System.out.println(difer / (int) Math.pow(10, i - 1));
//
//			num = num - difer;
//
//		}

		 assertEquals(2, getSecondDigit(number));
		 assertEquals(1, getFirstDigit(number));
		 assertEquals(3, getThirdDigit(number));

	}

	
	  private int getThirdDigit(int number) {
		  
		  int number1 = number % 10;
		  System.out.println(number1);
		  
		  return number1; 
		  }
	 
	  private int getSecondDigit(int number) { 
		
		return number/10 % 10;
	  }
	
	  private int getFirstDigit(int number) {
		  
		return number / 100 % 10;
	}

@Test
void getBitValueTest() {
	long number = 0x3ab7f5; //0011 1010 1011 0111 1111 0101
	assertEquals(1, BitOperation.getBitValue(number, 5));
	assertEquals(0, BitOperation.getBitValue(number, 11));
	assertEquals(0, BitOperation.getBitValue(number, 1));
	assertEquals(1, BitOperation.getBitValue(number, 2));
	assertEquals(-1, BitOperation.getBitValue(number, -2));
}

@Test
void setBitValueTest() {
	long number = 0x3ab7f5; //0011 1010 1011 0111 1111 0101
	assertEquals(0x3ab7e5, BitOperation.setBitValue(number, 5, false));
	assertEquals(0x3ab7f5, BitOperation.setBitValue(number, 5, true));

}

@Test
void revertBitValueTest() {
	long number = 0x3ab7f5; //0011 1010 1011 0111 1111 0101
	assertEquals(0x3ab7e5, BitOperation.revertBitValue(number, 5));


}


}
