package basic.advance;
import java.util.Scanner;

public class ForLoop {
	
	public static void add() {
		Scanner s1 = new Scanner(System.in);
		
		String name = s1.next();
		double a = s1.nextDouble();
		double b = s1.nextDouble();
		double c = a+b;
		
		//System.out.println("Addition is" + (a+b));
		System.out.println(name+" Addition of "+a+" and "+b+" is :"+c);
	    //s1.close();
	}

	public static void main(String[] args) {
    for(int i=1; i<=10; i++) {
    	
    	System.out.println("Enter name of "+i+" student and two numbers :");
    	add();
		}
	}

}
