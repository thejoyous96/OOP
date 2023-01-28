package oop1;

public class Subtraction extends Addition {
	
	//Addition is the Parent Class
	
	//OOP
	//1. Inheritance - Parent/Child Relationship - EXTENDS keywords
	//2. Polymorphism - 1. Overloading and 2. Overriding
	//3, Encapsulation -- access modifiers 
			//1. Public - accessible within the project 
			//2. Private
			//3. Default - accessible within the package
			//4. Protected
	//4. Abstraction
	
	
	void sub (int a, int b) {
		int s = a - b; 
		System.out.println(s);
	}//end sub
		
	public int add(int a, int b, int c){
		int sum = a + b + c + 5; 
		return sum;
	}//end add
	
	//inheritance = establish parent child relationship between two class

	public static void main(String[] args) {

		Subtraction s1 = new Subtraction(); 
		s1.sub(100, 50);
		
		//(100 + 100 + 100) - 75
		int sub = s1.add(100, 100, 100); 
		s1.sub(sub, 75);
		
	}//end main

}//end class
