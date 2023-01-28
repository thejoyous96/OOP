package oop1;

public class Addition {
	
	//Today's Date: January 21, 2023
	
	private int x; 
	private int y; 
	
	//Polymorphism - Poly (Many) - Morphism
	//1. Method Overloading -- a. Number of parameter is different
	//b. if same number of parameter, the data type is different
	
	//2.Method Overriding 
	//
	
	//return type, method name ()
	//The void keyword specifies that a method should not have a return value.

	//What is a object? Object is an instance of a class. 
	//Class Name, Object Name = new Class name --> to create an object
	
	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}

	//method overloading
	void add() {
		int sum = x + y; 
		System.out.println(sum); 
	}//end add
	
	public int add(int a, int b, int c) {
		//add is an integer value so it return a whole number
		int sum = a + b + c;
		return sum;
	}//end add
	
	protected double add (double a, double b, double c) {
		//double value return decimal number
		double sum = a + b + c; 
		return sum; 
	}//end add

	public static void main(String[] args) {
		Addition a1 = new Addition();
		//a1 is the object name
		a1.x = 10;
		a1.y = 20; 
		a1.add();
		
		Addition a2 = new Addition();
		//a2 is the object name
		a1.x = 100;
		a1.y = 200; 
		a1.add();
		
		int s1 = a1.add(20, 20, 20);
		System.out.println(s1);
		
		System.out.println(a1.add(100.30, 200.00, 200.00));
	}//end of main class

}//end of class
