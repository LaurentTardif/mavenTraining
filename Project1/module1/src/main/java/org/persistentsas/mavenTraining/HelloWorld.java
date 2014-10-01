package org.persistentsas.mavenTraining ; 

public class HelloWorld {

	protected StringBuffer msg = new StringBuffer("Hello World, my name is ") ; 
	
	public HelloWorld(String yourName) {
		msg.append(yourName);
	}
	
	public StringBuffer getMessage() {
		return msg ;
	}
	
	public static void main(String[] args) {
		HelloWorld instance = new HelloWorld("John Doo");
		System.out.println(instance.getMessage());
	}	

}
