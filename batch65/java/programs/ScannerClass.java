package batch65.java.programs;

import java.util.Scanner;

public class ScannerClass {

	static Scanner s1 = new Scanner(System.in);
	
	static void CircumferenceOfCircle() {
		System.out.println("Enter radius of circle :");
		double r = s1.nextDouble();
		double CircumferenceOfCircle = 2*Math.PI*r;
		System.out.println("Circumference of circle is : " + CircumferenceOfCircle);
	}
	
	static void CircumferenceOfTriangle() {
		System.out.println("Enter three sides of triangle :");
		double a = s1.nextDouble(), b = s1.nextDouble(), c = s1.nextDouble();
		double CircumferenceOfTriangle = a+b+c;
		System.out.println("Circumference of triangle is : " + CircumferenceOfTriangle);
	}
	
	public static void main(String[] args) {
		CircumferenceOfCircle();
		CircumferenceOfTriangle();
	}
}
