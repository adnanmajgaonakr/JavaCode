package basic.advance;

import java.util.Arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int [] array1 = new int[5];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		
		int array2 [] = new int[array1.length];
		
		for(int i=0; i<array1.length; i++) {
			
			array2[i]  = array1[i];
		}
		System.out.println("Array1 values are : "+Arrays.toString(array1));
		System.out.println("Array2 values after copying from Array1 are : "+Arrays.toString(array2));
	}

}
