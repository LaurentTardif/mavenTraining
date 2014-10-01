package org.persistentsas.mavenTraining ; 


public class HelloWorld2 extends HelloWorld {

	private StringBuffer comeFrom = new StringBuffer (" and I come from ") ; 
	
	public HelloWorld2(String yourName, String comeFrom) {
		super(yourName);
		msg.append(this.comeFrom);
		msg.append(comeFrom);
	}

	
	public static void main(String[] args) {
		HelloWorld2 instance = new HelloWorld2("John Doo","Earth");
		System.out.println(instance.getMessage());
	}	

}
