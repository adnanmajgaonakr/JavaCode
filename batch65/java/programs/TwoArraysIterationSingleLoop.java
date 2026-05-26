package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysIterationSingleLoop {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int [] rollNo = new int[s1.nextInt()];
		for(int i=0; i<rollNo.length; i++) {
			System.out.print("Enter the Roll no for index position " +i+ " : ");
			rollNo[i] = s1.nextInt();
		}
		System.out.println("Array elements are : " + Arrays.toString(rollNo));
		
		String [] name = new String[rollNo.length];
		for(int i=0; i<name.length; i++) {
			System.out.print("Enter the Name for index position " +i+ " : ");
			name[i] = s1.next();
		}
		System.out.println("Array elements are : " + Arrays.toString(name));
		
		for(int i=0; i<rollNo.length; i++) {
			System.out.println("At index position " +i+ 
					" Roll no is : " +rollNo[i]+ " and Name is : " +name[i]);
		}
		s1.close();
	}
}
