package basic.advance;

import java.util.Scanner;

public class ScannerClass3 {
	
	public static void main(String[] args) {
		System.out.println("1. Area of circle");
		System.out.println("2. Area of triangle");
		System.out.println("3. Area of square");
		System.out.println("4. Area of rectangle");
		System.out.println("Enter the number of what you want to calculate : ");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		switch(a) {
		
		case 1 :
			System.out.print("Enter value for radius : ");
			int r = s1.nextInt();
			System.out.print("Area of circle is : ");
			System.out.println(Math.PI*r*r);
			break;
			
		case 2 :
			System.out.print("Enter value for lenght and breadth : ");
			int x = s1.nextInt();
			int y = s1.nextInt();
			System.out.print("Area of triangle is : ");
			System.out.println(0.5*x*y);
			break;
			
		case 3 :
			System.out.print("Enter value for side : ");
			int c = s1.nextInt();
			System.out.print("Area of square is : ");
			System.out.println(c*c);
			break;
			
		case 4 :
			System.out.print("Enter value of lenght and breadth : ");
			int l = s1.nextInt();
			int b = s1.nextInt();
			System.out.print("Area of rectangle is : ");
			System.out.println(l*b);
			break;
			
		default :
			System.out.println("Sorry!!! Wrong Choice...");
		}
		s1.close();
	}

}
