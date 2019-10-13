package edu.jspiders.firstspringapp.beans;

public class ClassA
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
	
	public void m1()
	{
		System.out.println("inside m1() of "+this.getClass().getSimpleName());
	}
}