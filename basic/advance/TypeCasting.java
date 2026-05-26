package basic.advance;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		// Converting byte into int
		byte b1 = 23;
		int i1 = b1;        // Implicitly
		int i2 = (int) b1;  // Explicitly
		
		System.out.println("---- Converting byte into int ----");
		System.out.println("Implicit value : " + i1);
		System.out.println("Explicit value : " + i2);
		
		// Converting int to byte
		int i = 100;
		byte b = (byte)i; // Explicitly
		System.out.println();
		System.out.println("---- Converting int into byte ----");
		System.out.println("Explicit value : " + b);
		
		// Converting float into double
		float f1 = 23.45f;
		double d1 = f1;           // Implicitly
		double d2 = (double) f1;  // Explicitly
		System.out.println();
		System.out.println("---- Converting float into double ----");
		System.out.println("Implicit value : " + d1);
		System.out.println("Explicit value : " + d2);
		
		// Converting double into float
		double d = 453.35;
		float f = (float) d;
		System.out.println();
		System.out.println("---- Converting double into float ----");
		System.out.println("Explicit value : " + f);
	}
}
