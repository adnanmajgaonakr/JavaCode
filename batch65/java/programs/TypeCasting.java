package batch65.java.programs;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Widening
		System.out.println("***** Widening *****");
		int a = 15;
		double b = a;   //Implicit way
		System.out.println("Before typecasting in implicit way value of a is : " +a);
		System.out.println("After typecasting in implicit way value of b is : " +b);
		
		double c = (double)a;   //Explicit way
		System.out.println("Before typecasting in explicit way value of a is : " +a);
		System.out.println("After typecasting in explicit way value of c is : " +c);
		
		//Narrowing
		System.out.println("***** Narrowing *****");
		
		double d = 45.67;
		int i = (int)d;
		System.out.println("After typecasting in explicit way value of d is : " +d);
		System.out.println("After typecasting in explicit way value of i is : " +i);
	}
}
