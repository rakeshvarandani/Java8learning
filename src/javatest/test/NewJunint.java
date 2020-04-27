package javatest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javatest.AddIt;
import junit.framework.TestCase;

class NewJunint {

	@Test
	void test() {
		
		assertTrue(true);
		
		AddIt alpha = new AddIt();
		
		int answer = alpha.add(2, 3);
		
		TestCase.assertEquals(5, answer);
		
		
		
		AddIt beta = new AddIt();
		
		
		
		
		assertEquals(alpha, beta);
		
		
		//fail("Not yet implemented");
	}

	
	@Test
	void test2() {
		

		AddIt alpha = new AddIt();
		
		AddIt beta = new AddIt();
		
		alpha = beta;
		
		int answer = alpha.add(2, 3);
		
		assertEquals(alpha, beta);
		
		TestCase.assertEquals(5, answer);
		assertTrue(true);
		//fail("Not yet implemented");
	}

}
