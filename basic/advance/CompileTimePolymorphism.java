package basic.advance;

public class CompileTimePolymorphism {
	
	public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

	public static void main(String[] args) {
		
		 System.out.println("Add two integers: " + add(10, 20));
	     System.out.println("Add three integers: " + add(10, 20, 30));
		 System.out.println("Add two doubles: " + add(5.5, 3.2));
	}
}
