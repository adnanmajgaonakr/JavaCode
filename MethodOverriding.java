package inheritance.programs;

import java.util.Scanner;

class Parent1{
	void method1() {
		System.out.println("Starting Car...");
	}
}
class Child1 extends Parent1{
	void method1() {
		System.out.println("Starting Bike...");
	}
}
class Child2 extends Child1{
	void method1() {
		System.out.println("Starting Truck...");
	}
}

public class MethodOverriding extends Child2 {

	void method1() {
		System.out.println("Starting Volvo...");
	}
	
	public static void main(String[] args) {
		System.out.println("Car, Bike, Truck, Volvo");
		System.out.println("Enter ypur choice :");
		Scanner s1 = new Scanner(System.in);
		String input = s1.next();
		
		if(input.equals("Car")) {
			Parent1 p1 = new Parent1();
			p1.method1();
		}
		else if(input.equals("Bike")) {
			Child1 c1 = new Child1();
			c1.method1();
		}
		else if(input.equals("Truck")) {
			Child2 c2 = new Child2();
			c2.method1();
		}
		else if(input.equals("Volvo")) {
			MethodOverriding m1 = new MethodOverriding();
			m1.method1();
		}
		else {
			System.out.println("Your choice is wrong...");
		}
	}
}
