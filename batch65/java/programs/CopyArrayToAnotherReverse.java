package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayToAnotherReverse {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int [] input = new int[s1.nextInt()];
		for(int i=0; i<input.length; i++) {
			System.out.print("Enter the number for index position " +i+ " : ");
			input[i] = s1.nextInt();
		}
		System.out.println("Input array is : " + Arrays.toString(input));
		
		int [] reverse = new int[input.length];
		for(int i=0,j=reverse.length-1; i<input.length; i++,j--) {
			reverse[j] = input[i];
		}
		System.out.println("Output array after reversing is : " + Arrays.toString(reverse));
		
		s1.close();
	}
}
