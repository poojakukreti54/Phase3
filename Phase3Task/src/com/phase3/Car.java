package com.phase3;



/*
1. To create two Java classes. Class 'Vehicle' and 'Car'. One of them will be an abstract class and the other one will extend the abstract class.
2. The abstract class will have two abstract functions - 'drive' and 'park'. And it will have data members: noOfWheels, colour, brand.
3. The child class will override the abstract functions and print the appropriate message as concrete implementation.


4. In the child class, assign values to the inherited data members via a parameterized constructor.
BONUS - In addition to the parameterized constructor, find a way to create an object of the implementing class without any parameters and to assign values via functions.

*/




public class Car extends Vehicle{

	
	
	public Car() {
		super();
	}

	public Car(int noOfwheels, String color, String brand) {
		super(noOfwheels, color, brand);
		// TODO Auto-generated constructor stub
	}


	
	public void park() {
		// TODO Auto-generated constructor stub
		System.out.println("concrete park implementation");
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("concrete drive implementation");
	}
	
	Car obj = new Car(4,"red","benz");
	Car obj2 = new Car(2,"black","scooty");
	
	
	
	
	

	@Override
	public String toString() {
		return "Car [obj=" + obj + ", obj2=" + obj2 + ", noOfwheels=" + noOfwheels + ", color=" + color + ", brand="
				+ brand + "]";
	}
	
	
	
	
	

}
