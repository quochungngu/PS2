package baseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class TestMyInteger {
	// isEven(MyInteger), isPrime(MyInteger), isEquals(MyInteger), and all the isOdd 
	// are tested methods because all of these use the code of is"  "() through an
	// is"   "(int). So if they pass, is"  "() and is"   "(int) passes.
	
	@Test
	public void isEvenTest() {
		MyInteger instance1 = new MyInteger(12);
		MyInteger instance2 = new MyInteger(53);
		MyInteger instance3 = new MyInteger(184);
		
		assertEquals(MyInteger.isEven(instance1), true);
		assertEquals(MyInteger.isEven(instance2), false);
		assertEquals(MyInteger.isEven(instance3), true);

	}
	
	@Test
	public void isPrimeTest() {
		MyInteger instance1 = new MyInteger(7);
		MyInteger instance2 = new MyInteger(17);
		MyInteger instance3 = new MyInteger(113);
		
		MyInteger instance4 = new MyInteger(8);
		MyInteger instance5 = new MyInteger(15);
		MyInteger instance6 = new MyInteger(21);
		MyInteger instance7 = new MyInteger(1);
		
		assertEquals(MyInteger.isPrime(instance1), true);
		assertEquals(MyInteger.isPrime(instance2), true);
		assertEquals(MyInteger.isPrime(instance3), true);
		assertEquals(MyInteger.isPrime(instance4), false);
		assertEquals(MyInteger.isPrime(instance5), false);
		assertEquals(MyInteger.isPrime(instance6), false);
		assertEquals(MyInteger.isPrime(instance7), false);
	}
	
	@Test
	public void isEqualsTest() {
		MyInteger instance1 = new MyInteger(12);
		MyInteger instance2 = new MyInteger(53);
		MyInteger instance3 = new MyInteger(12);
		
		assertEquals(instance1.isEquals(instance2), false);
		assertEquals(instance1.isEquals(instance3), true);
		assertEquals(instance2.isEquals(instance3), false);
	}
	
	@Test
	public void isOddNoArgTest() {
		MyInteger instance1 = new MyInteger(12);
		MyInteger instance2 = new MyInteger(53);
		MyInteger instance3 = new MyInteger(184);
		
		assertEquals(instance1.isOdd(), false);
		assertEquals(instance2.isOdd(), true);
		assertEquals(instance3.isOdd(), false);
	}
	
	@Test
	public void isOddIntgerTest() {
		assertEquals(MyInteger.isOdd(12), false);
		assertEquals(MyInteger.isOdd(53), true);
		assertEquals(MyInteger.isOdd(184), false);
	}
	
	@Test
	public void isOddMyIntegerTest() {
		MyInteger instance1 = new MyInteger(12);
		MyInteger instance2 = new MyInteger(53);
		MyInteger instance3 = new MyInteger(184);
		
		assertEquals(MyInteger.isOdd(instance1), false);
		assertEquals(MyInteger.isOdd(instance2), true);
		assertEquals(MyInteger.isOdd(instance3), false);
	}
}
