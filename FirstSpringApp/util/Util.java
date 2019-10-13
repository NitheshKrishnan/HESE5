package edu.jspiders.firstspringapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.firstspringapp.beans.ClassA;
import edu.jspiders.firstspringapp.beans.ClassB;

public class Util 
{
	public static void main(String[] args) 
	{
		// create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		// use the Bean
		ClassA a = (ClassA) context.getBean("a");
		ClassB b = (ClassB) context.getBean("b");
		
		a.m1();
		b.m2();
		
		// close the container
		context.close();
	}
}
