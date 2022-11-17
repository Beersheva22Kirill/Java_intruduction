package java_introduction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	@Test
	void arrOneStepToSortTestTrue() {		
		int ar1[] = { 10, 2, 3, 4, 1 };
		int ar2[] = { 1, 2, 4, 3, 5, 10 };
		int ar3[] = { 1, 2, 3, 10, 5, 4 };
		int ar4[] = { 1, 5, 3, 4, 2, 10 };
		int ar5[] = { 1, 2, 3, 4, 10, 5 };
		int ar6[] = { 2, 1, -3, 4, 5, 10 };
		int ar7[] = { 3, 2, 1, 4, 5, 6 };
		int ar8[] = {1,2,2,3,3,4,4,4,3,5};
		int ar9[] = {1,2,4,3,3,3,5};
		assertTrue(MyArrays.arrOneStepToSort(ar1));
		assertTrue(MyArrays.arrOneStepToSort(ar2));
		assertTrue(MyArrays.arrOneStepToSort(ar3));
		assertTrue(MyArrays.arrOneStepToSort(ar4));
		assertTrue(MyArrays.arrOneStepToSort(ar5));
		assertTrue(MyArrays.arrOneStepToSort(ar6));
		assertTrue(MyArrays.arrOneStepToSort(ar7));
		assertTrue(MyArrays.arrOneStepToSort(ar8));
		assertTrue(MyArrays.arrOneStepToSort(ar9));

	}
	@Test
	void arrOneStepToSortTestFalse() {		
		int ar1[] = { 1, 2, 3, 10, -1, 5, 6 };
		int ar2[] = { 1, 2, 3, 4, 5, 10 };
		int ar3[] = { 5, 1, 2, 4, 6, 10 };
		int ar4[] = { 1, 5, 2, 4, 3, 10 };
		int ar5[] = { 1, 3, 2, 5, 4, 10, 8 };
		int ar6[] = {1, 3, 20, 4, 5, 6, 10};
		int ar7[] = {1, 3, 20, 4, 5, 11, 2};
		assertFalse(MyArrays.arrOneStepToSort(ar1));
		assertFalse(MyArrays.arrOneStepToSort(ar2));
		assertFalse(MyArrays.arrOneStepToSort(ar3));
		assertFalse(MyArrays.arrOneStepToSort(ar4));
		assertFalse(MyArrays.arrOneStepToSort(ar5));
		assertFalse(MyArrays.arrOneStepToSort(ar6));
		assertFalse(MyArrays.arrOneStepToSort(ar7));

	}
	
	@Test 
	void bubleSortArrTest() {
		int expected[] = {1,2,3,4,4,5,6,7,8};
		assertArrayEquals(expected, MyArrays.bubleSortArr(new int []{1,3,2,4,4,8,7,6,5}));
	}
	
	@Test 
	void sumEventIndexesTest() {
		assertEquals(20, MyArrays.sumEventIndexes(new int []{1,2,9,8,6,5,4,3,0}) );
	}
	
	@Test 
	void sumOddIndexesTest( ) {
		assertEquals(18, MyArrays.controlSumOddIndexes(new int []{1,2,9,8,6,5,4,3,0}) );
	}
	
	@Test
	void binarySearchFirstIndexTest() {
		assertEquals(4, MyArrays.binarySearchFirstIndex(new int []{1,2,3,4,6,6,6,6,8,9,13,14}, 6) );
		assertEquals(1, MyArrays.binarySearchFirstIndex(new int []{1,2,2,2,6,6,6,6,8,9,13,14}, 2) );
		assertEquals(9, MyArrays.binarySearchFirstIndex(new int []{1,2,3,4,4,5,5,6,8,9,9,9}, 9) );
		assertEquals(4, MyArrays.binarySearchFirstIndex(new int []{1,2,3,4,5,6,6,6,8,9,13,14}, 5) );
		assertEquals(-10, MyArrays.binarySearchFirstIndex(new int []{1,2,3,4,5,6,6,6,7,8,13,14}, 9) );
		assertEquals(-8, MyArrays.binarySearchFirstIndex(new int []{1,2,3,4,5,6,6,6,8,13,14}, 7) );
	}
	
	@Test
	void getNumberFromDigitsTest() {
		int expectedNumber = 1234;
		assertEquals(expectedNumber, Numbers.getNumberFromDigits(new int []{1,2,3,4}));
	}
	
	@Test 
	void addsNumderTest() {
		int originalArray[] = {1,2,3,4};
		int expected[] = {1,2,3,4,5};
		assertArrayEquals(expected, MyArrays.addsNumder(originalArray, 5));
	}
	
	@Test
	void removeNumbertest() {
		int originalArray[] = {1,2,3,4,5,9,12,4,6,8,34,27,43};
		int expected[] = {1,2,3,4,5,9,4,6,8,34,27,43};
		int expectedFalse[] = {1,2,3,4,5,9,12,4,6,8,34,27,43};
		assertArrayEquals(expected, MyArrays.removeNumber(originalArray, 6));
		assertArrayEquals(new int []{1,2,3,4,5,9,12,4,6,8,34,27}, MyArrays.removeNumber(originalArray, 12));
		assertArrayEquals(new int []{2,3,4,5,9,12,4,6,8,34,27,43}, MyArrays.removeNumber(originalArray, 0));
		assertArrayEquals(expectedFalse, MyArrays.removeNumber(originalArray, 16));
	}
	
	@Test
	void insertSortedTest() {
		int originalArray[] = {1,2,3,4,5,6,7,8};
		int expected[] = {1,2,3,4,4,5,6,7,8};
		assertArrayEquals(expected, MyArrays.insertSorted(originalArray, 4));
	}
	
	@Test
	void getDigitsTest() {
		int expected[] = { 1, 2, 3, 4 };
		Numbers.getDigits(1234);
		assertArrayEquals(expected, Numbers.getDigits(1234));
	}

	@Test
	void isSumTwoTestTrue() {
		short expected[] = { 4, 10, 8, 7, 1, 5, 3};
		short isSum = 7;
		
		short expected2[] = { 1, 3, 8, 7, 2, 5, 2};
		short isSum2 = 5;
		
		short expected3[] = { 1, 2, 8, 7, 3, 5, 2};
		short isSum3 = 13;
		
		short expected4[] = { 1, 2, 8, 7, 3, 5, 2};
		short isSum4 = 3;
		
		short expected5[] = { 1, 2, 5, 7, 5, 1, 2};
		short isSum5 = 10;
		
		short expected6[] = { 1, 3, 5, 7, 5, 1, 2};
		short isSum6 = 3;
		
		short ar[] = {1, 2, 5, 4, 5, 100, 9};
		short isSum7 = 101;
		
		assertEquals(true, MyArrays.isSumTwo(expected, isSum));
		assertEquals(true, MyArrays.isSumTwo(expected2, isSum2));
		assertEquals(true, MyArrays.isSumTwo(expected3, isSum3));
		assertEquals(true, MyArrays.isSumTwo(expected4, isSum4));
		assertEquals(true, MyArrays.isSumTwo(expected5, isSum5));
		assertEquals(true, MyArrays.isSumTwo(expected6, isSum6));
		assertEquals(true, MyArrays.isSumTwo(ar, isSum7));
		assertEquals(true, MyArrays.isSumTwo(ar, isSum7));
	}
	
	
	@Test
	void isSumTwoTestFalse() {
		short expected[] = { 4, 10, 8, 3, 1, 5, 3};
		short isSum = 10;		
		short expected1[] = { 10, 10, 8, 3, 1, 5, 3};
		short isSum1 = 19;		
		short expected2[] = { 4, 10, 8, 3, 1, 5, 3};
		short isSum2 = 2;
		
		assertEquals(false, MyArrays.isSumTwo(expected, isSum));
		assertEquals(false, MyArrays.isSumTwo(expected1, isSum1));
		assertEquals(false, MyArrays.isSumTwo(expected2, isSum2));
	}
	
}
