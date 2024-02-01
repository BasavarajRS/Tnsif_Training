package com.tnsif.day8.abstraction;
//abstract class
  abstract class Shape {
	  protected float area;
	  //abstrct method
	  abstract void calArea();
	  
	  //concrete method
	  
	  void show() {
		  System.out.println("area is "+area);
	  }
}
