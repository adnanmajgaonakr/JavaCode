package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayToAnother {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int [] input = new int[s1.nextInt()];
		for(int i=0; i<input.length; i++) {
			System.out.print("Enter the number for index position " +i+ " : ");
			input[i] = s1.nextInt();
		}
		System.out.println("Input array is : " + Arrays.toString(input));
		
		int [] output = new int[input.length];
		for(int i=0; i<output.length; i++) {
			output[i] = input[i];
		}
		System.out.println("Output array after copying is : " + Arrays.toString(output));
		
		s1.close();
	}
}
