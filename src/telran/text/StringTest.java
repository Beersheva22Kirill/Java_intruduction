package telran.text;

import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;

import org.junit.jupiter.api.*;

class StringTest {

	@Test
	void maxCharElement () {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals(111, Strings.maxCharElement(helloAr));
	}
	
	@Test
	void isAnagrammTestTrue () {
		String word = "yellow";
		assertTrue(Strings.isAnagram("hello", "oellh"));
		assertTrue(Strings.isAnagram("hello   987   jhgf", "hfgj   oellh   789"));
		assertTrue(Strings.isAnagram("    ", "    "));
		
		assertTrue(Strings.isAnagram(word, "loweyl"));
		assertTrue(Strings.isAnagram(word, "elolyw"));
		assertTrue(Strings.isAnagram(word, "wolley"));
		assertTrue(Strings.isAnagram(word, "loleyw"));
		
	}
	
	@Test
	void isAnagrammTestFalse () {
		
		String word = "yellow";
		assertFalse(Strings.isAnagram("hello", "oellhr"));
		assertFalse(Strings.isAnagram("hello   987   jhgf", "hegj   oellh   789"));
		assertFalse(Strings.isAnagram("      ", "     "));
		assertFalse(Strings.isAnagram("hello 987", "hello  987"));
		
		assertFalse(Strings.isAnagram(word,""));
		assertFalse(Strings.isAnagram(word, "yellob"));
		assertFalse(Strings.isAnagram(word,"yello"));
		assertFalse(Strings.isAnagram(word,"yelllo"));
		
	}
	
	@Test
	void sortStringNumbersTest() {
		String[] array1 = { "5", "-37", "15", "2", "22", "120", "118", "-110", "5", "2", "1", "0", "127", "-128", "1", "5" };
		String[] array2 = { "5", "-37", "15", "2", "22", "120", "118", "-110" };
		Strings.sortStringNumbers(array1);
		Strings.sortStringNumbers(array2);
		
		assertArrayEquals(new String[] { "-128", "-110", "-37", "0", "1", "1", "2", "2", "5", "5", "5", "15", "22", "118", "120", "127" }, array1);
		assertArrayEquals(new String[] { "-110", "-37","2","5","15" ,"22","118","120"}, array2);
	}
	@Test
	void javaVariebleTest() {
		assertTrue("java".matches(Strings.javaNameExp()));
		assertFalse("1java".matches(Strings.javaNameExp()));
		assertFalse("_".matches(Strings.javaNameExp()));
		assertTrue("__".matches(Strings.javaNameExp()));
		assertTrue("java_1_2".matches(Strings.javaNameExp()));
		assertTrue("$".matches(Strings.javaNameExp()));
		assertFalse("$ _".matches(Strings.javaNameExp()));
		
	}
	
	@Test
	void ipV4OctetTest(){
		assertTrue("1".matches(Strings.ipV4Octet()));
		assertTrue("10".matches(Strings.ipV4Octet()));
		assertTrue("100".matches(Strings.ipV4Octet()));
		assertTrue("255".matches(Strings.ipV4Octet()));
		assertTrue("249".matches(Strings.ipV4Octet()));
		
		assertFalse("256".matches(Strings.ipV4Octet()));
		assertFalse("265".matches(Strings.ipV4Octet()));
		assertFalse("-1".matches(Strings.ipV4Octet()));
		assertFalse("2561".matches(Strings.ipV4Octet()));
	}
	
	@Test
	void ipV4Test(){
		assertTrue("255.255.255.255".matches(Strings.ipV4()));
		assertTrue("1.0.0.0".matches(Strings.ipV4()));
		assertTrue("0.0.0.0".matches(Strings.ipV4()));
		assertTrue("1.1.1.1".matches(Strings.ipV4()));
		assertTrue("001.001.001.249".matches(Strings.ipV4()));
		assertTrue("001.001.001.245".matches(Strings.ipV4()));
		assertTrue("192.168.1.245".matches(Strings.ipV4()));
		
		assertFalse("1.1.1.265".matches(Strings.ipV4()));
		assertFalse("265.1.1.1".matches(Strings.ipV4()));
		assertFalse("192.168.1.256".matches(Strings.ipV4()));
		assertFalse("123.123.256.111".matches(Strings.ipV4()));
		assertFalse("123.256.123.111.".matches(Strings.ipV4()));
		assertFalse("256.123.123.111.".matches(Strings.ipV4()));
		assertFalse("123123.256.111".matches(Strings.ipV4()));
		assertFalse("123.123256.111".matches(Strings.ipV4()));
		assertFalse("123.123.256111".matches(Strings.ipV4()));
			
	}
	
	@Test
	void ipV4_v2Test(){
		assertTrue("255.255.255.255".matches(Strings.ipV4_v2()));
		assertTrue("1.0.0.0".matches(Strings.ipV4_v2()));
		assertTrue("0.0.0.0".matches(Strings.ipV4_v2()));
		assertTrue("1.1.1.1".matches(Strings.ipV4_v2()));
		assertTrue("001.001.001.249".matches(Strings.ipV4_v2()));
		assertTrue("001.001.001.245".matches(Strings.ipV4_v2()));
		assertTrue("192.168.1.245".matches(Strings.ipV4_v2()));
		
		assertFalse("1.1.1.265".matches(Strings.ipV4_v2()));
		assertFalse("265.1.1.1".matches(Strings.ipV4_v2()));
		assertFalse("192.168.1.256".matches(Strings.ipV4_v2()));
		assertFalse("123.123.256.111".matches(Strings.ipV4_v2()));
		assertFalse("123.256.123.111.".matches(Strings.ipV4_v2()));
		assertFalse("256.123.123.111.".matches(Strings.ipV4_v2()));
		assertFalse("123123.256.111".matches(Strings.ipV4_v2()));
		assertFalse("123.123256.111".matches(Strings.ipV4_v2()));
		assertFalse("123.123.256111".matches(Strings.ipV4_v2()));
			
	}
	
	@Test
	void computeExpressionTest() {
		assertEquals(10.5, computeArithmeticExpression("2 + 2 + 1 * 2 + 0.5", null, null));
		assertEquals(10.5, computeArithmeticExpression("(2 + 2 + 1) * 2 + 0.5", null, null));
		assertEquals(10.5, computeArithmeticExpression("(2) + (2) + 1 * 2 + 0.5", null, null));
		assertTrue(Double.isNaN(computeArithmeticExpression("(2 + 2)) + (10", null, null)));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 +( 2 + 10", null, null)));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 +( 2 +) 10", null, null)));
		assertTrue(Double.isNaN(computeArithmeticExpression("2 # 2 ++ 10", null, null)));
		assertTrue(Double.isNaN(computeArithmeticExpression("d2 + 2 + 10", null, null)));
		assertEquals(10.5, computeArithmeticExpression("a + 2 + c * 2 + 0.5", new double[] {2,1}, 
				new String[] {"a","c"}));
		
		assertTrue( Double.isNaN(computeArithmeticExpression("a + 2 + c * 2 + d23", 
				new double[] {2,1}, new String[] {"a","c"})));
		
		assertTrue( Double.isNaN(computeArithmeticExpression("a + 2 + c * (2 + d23)", 
				new double[] {2,1}, new String[] {"a","c"})));
		
		assertEquals(10.5, computeArithmeticExpression("(a + 2 + c) * 2 + 0.5", new double[] {2,1}, 
				new String[] {"a","c"}));
	
	}

}
