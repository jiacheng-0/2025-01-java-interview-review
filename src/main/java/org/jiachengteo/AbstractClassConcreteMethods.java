package org.jiachengteo;

public class AbstractClassConcreteMethods {

	public static void main(String[] args) {

		// call shape
		Shape circle = new Circle("Red", 5);
		circle.displayColor();
	}
}

class Circle extends Shape {
	double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

abstract class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	abstract double getArea();

	void displayColor() {
		System.out.println("Color: " + color);
	}
}