package edu.jspiders.beanwiringexplicit.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringexplicit.beans.Pen;

public class BeanWiringExplicitUtil 
{
	public static void main(String[] args) 
	{
		// create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// use the Bean
		Pen p = (Pen) context.getBean("p");
		
		System.out.println(p);
		
		// close the container
		context.close();
	}
}
