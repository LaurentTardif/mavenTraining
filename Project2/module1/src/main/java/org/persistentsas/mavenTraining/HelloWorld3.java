package org.persistentsas.mavenTraining ; 

import java.util.Locale; 
import java.util.ResourceBundle; 

public class HelloWorld3 {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println("Current locale is : " + locale);
		ResourceBundle rb = ResourceBundle.getBundle("LanguageSpecific",locale);
        String hello = rb.getString("Hello");
		String world = rb.getString("World");
		System.out.println(hello+" "+world);
	}	

}
