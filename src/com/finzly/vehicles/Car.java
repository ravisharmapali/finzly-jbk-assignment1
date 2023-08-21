package com.finzly.vehicles;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car is starting ");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating Car");
		
	}

	@Override
	public void brake() {
		System.out.println("Breaking Car");
		
	}
	
}
