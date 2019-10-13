package edu.jspiders.firstspringapp.beans;

public class ClassB
{
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
	
	public void m2()
	{
		System.out.println("inside m2() of "+this.getClass().getSimpleName());
	}
}