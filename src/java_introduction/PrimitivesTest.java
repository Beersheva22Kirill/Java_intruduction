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

		return number / 10 % 10;
	}

	private int getFirstDigit(int number) {

		return number / 100 % 10;
	}

	@Test
	void getBitValueTest() {
		long number = 0x3ab7f5; // 0011 1010 1011 0111 1111 0101
								// 0011 1010 1011 0111 1101 0101
								// 0011 1010 1011 0111 1111 0101
		assertEquals(1, BitOperation.getBitValue(number, 5));
		assertEquals(0, BitOperation.getBitValue(number, 11));
		assertEquals(0, BitOperation.getBitValue(number, 1));
		assertEquals(1, BitOperation.getBitValue(number, 2));
		assertEquals(-1, BitOperation.getBitValue(number, -2));

		number = -1;
		assertEquals(1, BitOperation.getBitValue(number, 63));
	}

	@Test
	void setBitValueTest() {
		long number = 0x3ab7f5; // 0011 1010 1011 0111 1111 0101
								// 0011 1010 1011 0111 1111 0101
		assertEquals(0x3ab7d5, BitOperation.setBitValue(number, 5, false));
		assertEquals(0x3ab7f5, BitOperation.setBitValue(number, 5, true));

	}

	@Test
	void revertBitValueTest() {
		long number = 0x3ab7f5; // 0011 1010 1011 0111 1111 0101
		assertEquals(0x3ab7d5, BitOperation.invertBitValue(number, 5));
		number = BitOperation.invertBitValue(number, 62); // 63 not work
		assertEquals(0, BitOperation.getBitValue(number, 63));

	}

	@Test
	void digitsNumberTest() {
		int number = 5673;
		assertEquals(4, Numbers.getNdigits(number));
	}

	@Test
	void ledingZerosTest() {
		long number = 0x3ab7f0; // 0011 1010 1011 0111 1111 0000
		assertEquals(42, BitOperation.leadingZeros(number));
	}

	@Test
	void onesInNumberTest() {
		int number = 0x3ab7f0; // 0011 1010 1011 0111 1111 0000
		assertEquals(14, BitOperation.onesInNumber(number));
	}

	@Test
	@Disabled
	void isHappyNumberTest() {
		int numHappy = 627906;
		int numNotHappy = 543986;
		assertEquals(true, Numbers.isHappyNumber(numHappy));
		assertEquals(false, Numbers.isHappyNumber(numNotHappy));
		assertFalse(Numbers.isHappyNumber(numNotHappy));
		assertTrue(Numbers.isHappyNumber(numHappy));
	}

	@Test
	void verifyTest() {
		assertEquals(true, IsraelIdentity.verify(346872658));
	}

	@Test
	void generateRandomIdTest() {
		assertEquals(9, Numbers.getNdigits(IsraelIdentity.generateRandomId()));
	}

}
