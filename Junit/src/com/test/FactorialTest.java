package com.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import com.day13.Factorial;

import com.day13.*;

@RunWith(Parameterized.class)
public class FactorialTest {
	static Factorial fac;
	
	int input ;
	int expected ;
	
	
	
	public FactorialTest(int input,int expected) {
		super();
		this.input = input;
	}

	@BeforeClass
	public static void  beforeClass () {
		fac = new Factorial();
	}
	
	@AfterClass
	public static void AfterClass() {
		fac = null;
		
	}

	@Test
	public void testGetFactorial() {
		fac.getFactorial(input);

	}
	
	@Parameters
	public static Collection facts() {
		return Arrays.asList(new Object[][] {
			{1,1},
			{2,4}
		});
	}
	

}
