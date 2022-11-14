package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	
	Calculator c=new Calculator();
	
	@Test
	public void testsayHello() {
		
		Assertions.assertEquals("Hello", c.sayHello());
		
	}
	
	@Test
	public void testAddMethod() {
		Assertions.assertEquals(100, c.add(50, 50),"Check the code!");
	}
	@Disabled
	@Test
	void testAssertFalse() {
		Assertions.assertTrue(10<11);
		Assertions.assertFalse(10>11);
		Assertions.assertNotEquals("hello", "hii");
	}
	
	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abcd";
		Assertions.assertNull(s1);
//		Assertions.assertNull(s2);
	}
	@Test
	public void testArrayList() {
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		Assertions.assertEquals(0, mylist.size());
		mylist.add(100);
		mylist.add(120);
		Assertions.assertEquals(2, mylist.size());
	}
	
}
