package edu.jspiders.setterinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection.beans.Mobile;

public class SetterUtil 
{
	public static void main(String[] args) 
	{
		// create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// use the Bean
		Mobile m = (Mobile) context.getBean("m2");
		
		System.out.println(m);
		
		// close the container
		context.close();
	}
}
