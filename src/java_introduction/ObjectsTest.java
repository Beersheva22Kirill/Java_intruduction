package java_introduction;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class ObjectsTest {

	@Test
	void wrapperTest() {
		
		Integer a = 10;
		Integer b = 11;
		assertEquals(++a, b); 
		Integer c = 201;
		Integer d = 201;
		assertEquals(c, d);
		assertTrue(a == b);
		assertFalse(c == d); 
	}
	
	@Test 
	void stringTest () {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h', helloAr[0]);
		assertEquals(5, hello.length());
	}
	
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
}
