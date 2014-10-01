package org.persistentsas.mavenTraining ;



import org.junit.Assert;
import org.junit.Test;


public class HelloWorldTest {

	
	/** very basic test for demo purpose */
	@Test
	public void testGetMessage() {
		 HelloWorld underTest = new HelloWorld("Mickey Mouse");
		 Assert.assertTrue("The getMessage did not return what's expected : (" + underTest.getMessage()+") instead of ("+"Hello World, my name is Mickey Mouse"+")",underTest.getMessage().toString().equals("Hello World, my name is Mickey Mouse"));
	}

}
