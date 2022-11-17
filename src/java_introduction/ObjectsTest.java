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
		System.out.println((int)helloAr[0]);
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
		assertTrue(Strings.isAnagramm("hello", "oellh"));
		assertTrue(Strings.isAnagramm("hello   987   jhgf", "hfgj   oellh   789"));
		
	}
	
	@Test
	void isAnagrammTestFalse () {
		assertFalse(Strings.isAnagramm("hello", "oellhr"));
		assertFalse(Strings.isAnagramm("hello   987   jhgf", "hegj   oellh   789"));
		
	}
}
