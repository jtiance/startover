package com.subclass;

import com.superclass.Clothing;

public class Shirt extends Frock implements Clothing{
	
	private double size;
	private String color;
	private double price;
	
	public Shirt(){
		this.size = 28.0;
		this.color = "Red";
		this.price = 89.0;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getDetails(){
		return "Size is " + size + ", Color is " + color + ", Price is " + price;
	}
	
	public double calcArea(){
		return size * 1.3;
	}
}