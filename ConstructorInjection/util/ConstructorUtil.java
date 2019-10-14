package edu.jspiders.constructorinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.constructorinjection.beans.Employee;

public class ConstructorUtil 
{
	public static void main(String[] args) 
	{
		// create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// use the Bean
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = (Employee) context.getBean("emp2");
		
		System.out.println(e1);
		System.out.println(e2);
		
		// close the container
		context.close();
	}
}
