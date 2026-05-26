package basic.advance;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		try {
		Scanner s1 = new Scanner(System.in);
		int [] age = new int[s1.nextInt()];
		age[0] = 41;
		age[1] = 18;
		age[2] = 45;
		System.out.println(Arrays.toString(age));
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("Enter array size more than or equal to 3.");
		}
		catch(NegativeArraySizeException n1) {
			System.out.println("Enter array size in positive whole number.");
		}
		catch(InputMismatchException i1) {
			System.out.println("Enter array size in positive whole number.");
		}
	}

}
