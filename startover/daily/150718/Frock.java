package com.subclass;

public abstract class Frock{
	private double size;
	private String color;
	private double price;
	private static int currentNum = 100000;
	private final int serialNumber;   //空final变量
	
	public static final int INCREMENT = 100;
	
	static{
		currentNum = 150000;
	}
	
	public Frock(){
		serialNumber = getNextNum();
	}
	
	public Frock(double size, String color, double price){
		serialNumber = getNextNum();
		this.size = size;
		this.color = color;
		this.price = price;
	}
	
	
	public abstract double calcArea();
	/**
	试图改变final修饰的成员属性serialNumber的值, 编译不通过.
	public void setSerialNumber(int serialNumber){
		this.serialNumber = serialNumber;
	}*/
	
	public int getSerialNumber(){
		return serialNumber;
	}
	
	public static int getNextNum(){
		return currentNum += INCREMENT;
	}
	
	public void setSize(double size){
		this.size = size;
	}
	
	public double getSize(){
		return size;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString(){
		return "衣服的大小为: " + getSize() + ", 颜色为: " + getColor() + ", 价格为: " + getPrice() + "美金.";
	}
}
