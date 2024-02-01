package com.tnsif.day8.methodOverriding;

public class MethodOverriding {
		//Dynamic Binding 
	public static void main(String[] args) {
		RBI rbi;
		rbi=new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi= new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateOfIntrest());
	}

}
