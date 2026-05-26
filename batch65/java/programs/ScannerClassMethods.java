package batch65.java.programs;

import java.util.Scanner;

public class ScannerClassMethods {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter input as string in one word :");
		String s = s1.next();
		System.out.println("You have given String input as :" + s);
		
		System.out.println("Enter input as byte :");
		byte b = s1.nextByte();
		System.out.println("You have given byte input as :" + b);
		
		System.out.println("Enter input as short :");
		short s2 = s1.nextShort();
		System.out.println("You have given short input as :" + s2);
		
		System.out.println("Enter input as int :");
		int i = s1.nextInt();
		System.out.println("You have given short input as :" + i);
		
		System.out.println("Enter input as long :");
		long l = s1.nextLong();
		System.out.println("You have given long input as :" + l);
		
		System.out.println("Enter input as float :");
		float f = s1.nextFloat();
		System.out.println("You have given float input as :" + f);
		
		System.out.println("Enter input as double :");
		double d = s1.nextDouble();
		System.out.println("You have given double input as :" + d);
		
		System.out.println("Enter input as boolean :");
		boolean b1 = s1.nextBoolean();
		System.out.println("You have given boolean input as :" + b1);
		
		/*System.out.println("Enter input as string in multiple words:");
		String s3 = s1.nextLine();
		System.out.println("You have given String input as :" + s3);*/
		
		s1.close();
	}
}
