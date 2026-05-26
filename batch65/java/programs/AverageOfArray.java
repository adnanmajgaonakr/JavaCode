package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		double array1[] = new double[s1.nextInt()];
		for(int i=0; i<array1.length; i++) {
			System.out.print("Enter the value for index position " +i+ " : ");
			array1[i] = s1.nextDouble();
		}
		System.out.println("Array elements are : " + Arrays.toString(array1));
		
		double sum = 0;
		for(int i=0; i<array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("Sum of an array elements is : " + sum);
		
		double avg = sum/array1.length;
		System.out.println("Average of an array elements is : " + avg);
		
		s1.close();
		
	}
}
