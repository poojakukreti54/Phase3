package com.phase3;

public abstract class Vehicle {
	
	protected int noOfwheels;
	protected String color;
	protected String brand;
	
	
	//constructors
	public Vehicle() {
		
	}
	
	public Vehicle(int noOfwheels, String color, String brand) {
		super();
		this.noOfwheels = noOfwheels;
		this.color = color;
		this.brand = brand;
	}
	
	
	

	
	

	public int getNoOfwheels() {
		return noOfwheels;
	}

	public void setNoOfwheels(int noOfwheels) {
		this.noOfwheels = noOfwheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void drive() ;
	public abstract void park() ;

	

}
