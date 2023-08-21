package com.finzly.polymorphism;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = { new Circle(6.0), new Rectangle(3.0, 4.0), new Triangle(3.0, 4.0, 5.0) };

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Calculation for "+shapes[i].getClass().getSimpleName());
			System.out.println("Area " + shapes[i].calculateArea());
			System.out.println("Perimeter " + shapes[i].calculatePerimeter());
			System.out.println();
		}
	}
}
