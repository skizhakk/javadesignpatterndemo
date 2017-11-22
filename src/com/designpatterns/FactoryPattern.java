package com.designpatterns;

public class FactoryPattern {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		sf.getShape("CIRCLE").draw();
		sf.getShape("RECTANGLE").printShapeName();

	}
}

class ShapeFactory {
	
	public Shape getShape(String stringVar) {
		
		if ("RECTANGLE".equalsIgnoreCase(stringVar)) {
			return new Rectangle();
		}
		else if ("CIRCLE".equalsIgnoreCase(stringVar)) {
			return new Circle();
		}
		else {
			return new Rectangle();
		}
		 
		
	}
	
}
	
	
interface Shape {
	
	void draw();
	void printShapeName();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle ... ");
		
	}

	@Override
	public void printShapeName() {
		System.out.println("Printing the shape as rectangle ... ");
		
	}
	
}

class Circle  implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Circle ... ");
		
	}

	@Override
	public void printShapeName() {
		System.out.println("Printing the shape as Circle ... ");
		
	}
	
}




