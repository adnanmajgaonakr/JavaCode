package batch65.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumberIsPresentInArray {

	public static void main(String[] args) {
		
	/*	Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		double array1[] = new double[s1.nextInt()];
		for(int i=0; i<array1.length; i++) {
			System.out.print("Enter the value for index position " +i+ " : ");
			array1[i] = s1.nextDouble();
		}
		System.out.println("Array elements are : " + Arrays.toString(array1));
		System.out.print("Enter the number to check : ");
		double numberToCheck = s1.nextDouble();
		for(int i=0; i<array1.length; i++) {
			if(numberToCheck==array1[i]) {
				System.out.println("Number is present in the array at index "
						+ "position " +i);
			}
			else {
				System.out.println("Number is not present in the array");
			}
		}
		s1.close();
		*/
		
		Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        double array1[] = new double[s1.nextInt()];
        for(int i = 0; i < array1.length; i++) {
            System.out.print("Enter the value for index position " + i + " : ");
            array1[i] = s1.nextDouble();
        }
        System.out.println("Array elements are : " + Arrays.toString(array1));
        System.out.print("Enter the number to check : ");
        double numberToCheck = s1.nextDouble();
        boolean found = false;
        for(int i = 0; i < array1.length; i++) {
            if(numberToCheck == array1[i]) {
                System.out.println("Number is present in the array at index position " + i);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Number is not present in the array");
        }

        s1.close();
	}
}
