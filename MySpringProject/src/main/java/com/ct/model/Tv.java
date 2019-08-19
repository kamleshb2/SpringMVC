package com.ct.model;

public class Tv {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String name;
	private String brand;
	private int price;
	@Override
	public String toString() {
		return "Tv [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
