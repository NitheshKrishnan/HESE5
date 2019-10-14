package edu.jspiders.beanwiringexplicit.beans;

public class Pen 
{
	private int id;
	private String name;
	
	private Refil refil;
	
	public Pen()
	{
		System.out.println(this.getClass().getSimpleName()+ "Object Created");
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

	public Refil getRefil() {
		return refil;
	}

	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", name=" + name + ", refil=" + refil + "]";
	}

}