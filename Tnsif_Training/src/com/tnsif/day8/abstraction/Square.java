package com.tnsif.day8.abstraction;

public class Square extends Shape {
	float side;
	
	
	public Square() {
		super();
		this.side=4.0f;
	}
	
	


	public Square(float side) {
		super();
		this.side = side;
	}




	@Override
	void calArea() {
		area = side*side;
	}
}
