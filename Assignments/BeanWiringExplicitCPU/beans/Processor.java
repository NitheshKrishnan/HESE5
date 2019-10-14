package edu.jspiders.beanwiringexplicit.beans;

public class Processor 
{
	private int id;
	private String brand;
	private String speed;
	private double price;
	
	public Processor()
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

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Processor [id=" + id + ", brand=" + brand + ", speed=" + speed + ", price=" + price + "]";
	}
}