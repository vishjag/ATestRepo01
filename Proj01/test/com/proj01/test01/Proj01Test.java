package com.proj01.test01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Proj01Test {
	
	Proj01 objUnderTest;

	@Before
	public void setUp() throws Exception {
		objUnderTest = new Proj01();
	}

	@Test(expected = Exception.class)
	public void testGetIntAtCounter_counter_less_than_0_throws_Exception() throws Exception {
		objUnderTest.getIntAtCounter(-1);
	}
	
	@Test(expected = Exception.class)
	public void testGetIntAtCounter_counter_greater_than_size_throws_Exception() throws Exception {
		objUnderTest.getIntAtCounter(20);
	}
		
	@Test
	public void testGetIntAtCounter_works() throws Exception {
		assertEquals(1722, objUnderTest.getIntAtCounter(14));
	}

}
