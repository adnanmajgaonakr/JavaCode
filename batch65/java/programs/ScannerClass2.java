package batch65.java.programs;

import java.util.Scanner;

public class ScannerClass2 {

	static Scanner s1 = new Scanner(System.in);
	
	static void perimeterOfTriangle() {
		System.out.println("Enter three sides of triangle :");
		double a = s1.nextDouble(), b = s1.nextDouble(), c = s1.nextDouble();
		double perimeterOfTriangle = a+b+c;
		System.out.println("Perimeter of triangle is : " + perimeterOfTriangle);
	}
	
	public static void main(String[] args) {
		perimeterOfTriangle();
	}
}
