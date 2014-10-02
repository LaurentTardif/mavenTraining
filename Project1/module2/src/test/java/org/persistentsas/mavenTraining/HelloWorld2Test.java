package org.persistentsas.mavenTraining ;



import org.junit.Assert;
import org.junit.Test;


public class HelloWorld2Test {

	
	/** very basic test for demo purpose */
	@Test
	public void testGetMessage() {
		 HelloWorld2 underTest = new HelloWorld2("Mickey Mouse","Earth");
		 Assert.assertTrue("The getMessage did not return what's expected : (" 
				 + underTest.getMessage()
				 +") instead of ("+"Hello World, my name is Mickey Mouse and I come from Earth"
				 +")",underTest.getMessage().toString().equals("Hello World, my name is Mickey Mouse and I come from Earth"));
	}

}
