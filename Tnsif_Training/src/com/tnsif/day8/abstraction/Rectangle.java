package com.tnsif.day8.abstraction;

public class Rectangle extends Shape{
	float width,height;
	
	
	
	public Rectangle() {
		super();
	   this.width=6.0f;
	   this.height=10.0f;
	  
	}


	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	void calArea() {
		area = width*height;
	}
}
