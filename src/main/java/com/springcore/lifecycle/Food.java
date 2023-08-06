package com.springcore.lifecycle;

public class Food {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("detting price");
		this.price = price;
	}
	
	public Food() {
		super();
	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
