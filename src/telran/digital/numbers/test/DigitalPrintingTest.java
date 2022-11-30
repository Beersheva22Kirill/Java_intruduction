package telran.digital.numbers.test;

import org.junit.jupiter.api.*;
import static telran.digital.numbers.DigitalNumbersPrinting.*;
public class DigitalPrintingTest {
	@Test
	@Disabled
	void lineTest() {
		System.out.println(line(30, 30));
	}
	@Test
	@Disabled
	void verticalLineTest() {
		displayStrings(verticalLine(30, 5));
	}
	@Test
	@Disabled
	void twoVerticalLinesTest() {
		displayStrings(twoVerticalLines(30, 10, 5));
	}
	
	@Test
	@Disabled
	void zeroTest() {
		displayStrings(zero(5, 5, 4));
	}
	
	@Test
	@Disabled
	void oneTest() {
		displayStrings(one(5, 5, 4));
	}
	
	@Test
	@Disabled
	void twoTest() {
		displayStrings(two(5, 5, 5));
	}
	
	@Test
	void displayDigitalNumderTest() {
		displayDigitalNumder(1234567890, 5, 5, 7);
	}
	
}
