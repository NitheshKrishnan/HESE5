package edu.jspiders.setterinjection.beans;

public class Mobile
{
	private int id;
	private String brand;
	private String name;
	private double price;
	
	public Mobile() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}