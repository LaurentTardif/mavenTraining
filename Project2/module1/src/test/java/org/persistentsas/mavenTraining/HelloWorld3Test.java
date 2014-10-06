package org.persistentsas.mavenTraining ;



import org.junit.Assert;
import org.junit.Test;


public class HelloWorld3Test {

	
	/** very basic test for demo purpose */
	@Test
	public void testGetMessage() {
		String[] args=  {"Mickey Mouse","Earth"} ;
		 HelloWorld3.main(args);
		 Assert.assertTrue(true);
	}

}
