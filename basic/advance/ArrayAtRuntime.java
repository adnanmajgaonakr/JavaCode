package basic.advance;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAtRuntime {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of Arry : ");
		int [] rollno = new int[s1.nextInt()];
		for(int i=0; i<=rollno.length-1; i++) {
			
			System.out.println("Enter the number at position : "+i);
			rollno[i] = s1.nextInt();
		}
		
		System.out.println("Values entered in array are : "+Arrays.toString(rollno));
		s1.close();
	}

}
