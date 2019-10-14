package edu.jspiders.beanwiringexplicit.beans;

public class Refil 
{
	private int id;
	private String name;
	
	public Refil()
	{
		System.out.println(this.getClass().getSimpleName()+ "Object Created");
	}

	public Refil(int id, String name) 
	{
		System.out.println(this.getClass().getSimpleName()+ "Object Created using arg-constructor");
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Refil [id=" + id + ", name=" + name + "]";
	}
}