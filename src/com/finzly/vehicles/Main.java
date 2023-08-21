package com.finzly.vehicles;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.accelerate();
		vehicle.brake();
		vehicle = new Motorcycle();
		vehicle.start();
		vehicle.accelerate();
		vehicle.brake();
	}
}
