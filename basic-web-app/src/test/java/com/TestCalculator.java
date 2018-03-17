package com;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class TestCalculator {

	@Mock
	private Calculator calc;
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this); // Injects Calculator in calc 
		
		 // 	calc = new Calculator(); // we can remove this as its mocked
	}
	
	@Test
	public void abs(){
		
		
		/*int excepted = 4;
		int actual = calc.abs(-4);
		assertEquals(excepted,actual);*/
	//	assertEquals(20, calc.abs(-20)); // typical use case
		
		when(calc.abs(-20)).thenReturn(20); // calc.abs(20) method returns  output  20 
		assertEquals(20, calc.abs(-20)); // result is checked with thenReturn,change the then return and test case will fail
		
	}
}
