package com.test;

import com.superclass.Clothing;
import com.subclass.Frock;
import com.subclass.Shirt;

public class ImplTest{
	public static void main(String[] args){
		Clothing c = new Shirt();
		System.out.println(c.calcArea());
		System.out.println(c.getColor());
		System.out.println(c.getDetails());
		
		Frock f = new Shirt();
		System.out.println(f.calcArea());
	}
}