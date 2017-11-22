package com.designpatterns;

/**
 * Facade pattern hides the complexities of the system and 
 * provides an interface to the client using which the client 
 * can access the system. This type of design pattern comes 
 * under structural pattern as this pattern adds an interface 
 * to existing system to hide its complexities.
 * 
 * @author SKIZHAKK
 *
 */
public class FacadePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Shape {
	
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle !");
		
	}
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle !");
		
	}
	
}

class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	
	public void ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawShape() {
		circle.draw();
		rectangle.draw();
	}
	
	
}




