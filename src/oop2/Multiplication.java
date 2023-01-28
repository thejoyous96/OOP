package oop2;

import oop1.Addition;

public class Multiplication extends Addition {

	void multiple (int a, int b) {
		int m = a * b; 
		System.out.println(m);
	}
	
	void multiple (double a, double b) {
		double m = a * b;
		System.out.println(m);
	}

	public static void main(String[] args) {

		Multiplication m1 = new Multiplication();
		m1.multiple(10,10); 
		 
		//(100 + 100 + 100) * 20
		//Encapsulation -- Access modifiers 
		//1. Public - accessible within the project 
		//2. Private - accessible within the class
		//3. Default - accessible within the package
		//4. Protected - accessible within the package + outside of package if inherited 
		
		int m = m1.add(100,100,100); 
		m1.multiple(m, 20);
		
		//(100.7 + 100.6 + 100.5) * 10.00
		double m2 = m1.add(100.7, 100.6, 100.5);
		m1.multiple(m2, 10.00);
	}
}
