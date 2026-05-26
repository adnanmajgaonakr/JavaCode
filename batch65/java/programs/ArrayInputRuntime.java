package batch65.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputRuntime {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int [] array1 = new int[s1.nextInt()];
		
		for(int i=0; i<array1.length; i++) {
			
			System.out.print("Enter the value for index position " +i+ " :");
			array1[i] = s1.nextInt();
		}
		
		System.out.println("Array elements are : " + Arrays.toString(array1));
		s1.close();
	}
}
