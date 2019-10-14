package edu.jspiders.beanwiringexplicit.beans;

public class Ram 
{
	private int id;
	private String brand;
	private int size;
	private double price;
	
	public Ram()
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ram [id=" + id + ", brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
}