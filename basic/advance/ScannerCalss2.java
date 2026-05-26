package basic.advance;
import java.util.Scanner;

public class ScannerCalss2 {
	
	public static void main(String[] args) {
		
		System.out.println("1. Circumference of circle");
		System.out.println("2. Circumference of triangle");
		System.out.println("3. Circumference of square");
		System.out.println("4. Circumference of rectangle");
		System.out.println("Enter the number of what you want to calculate : ");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		switch(a) {
		
		case 1 :
			System.out.print("Enter value for radius : ");
			int r = s1.nextInt();
			System.out.print("Circumference of circle is : ");
			System.out.println(2*Math.PI*r);
			break;
			
		case 2 :
			System.out.print("Enter value for three sides : ");
			int x = s1.nextInt();
			int y = s1.nextInt();
			int z = s1.nextInt();
			System.out.print("Circumference of triangle is : ");
			System.out.println(x+y+z);
			break;
			
		case 3 :
			System.out.print("Enter value for side : ");
			int c = s1.nextInt();
			System.out.print("Circumference of square is : ");
			System.out.println(4*c);
			break;
			
		case 4 :
			System.out.print("Enter value of lenght and breadth : ");
			int l = s1.nextInt();
			int b = s1.nextInt();
			System.out.print("Circumference of rectangle is : ");
			System.out.println(2*(l+b));
			break;
			
		default :
			System.out.println("Sorry!!! Wrong Choice...");
		}
		s1.close();
	}

}
