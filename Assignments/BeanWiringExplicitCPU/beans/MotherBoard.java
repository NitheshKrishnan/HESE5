package edu.jspiders.beanwiringexplicit.beans;

public class MotherBoard 
{
	private int id;
	private String brand;
	private String dimension;
	private double price;
	
	public MotherBoard()
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

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MotherBoard [id=" + id + ", brand=" + brand + ", dimension=" + dimension + ", price=" + price + "]";
	}
}