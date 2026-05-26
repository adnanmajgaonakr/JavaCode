package basic.advance;

import java.util.Arrays;

public class ArrayEquals {
	
	public static void main(String[] args) {
		
		int [] array1 = new int [5];
		array1[0] = 56;
		array1[1] = 57;
		array1[2] = 58;
		array1[3] = 59;
		array1[4] = 60;
		
		int [] array2 = new int [5];
		array2[0] = 56;
		array2[1] = 57;
		array2[2] = 58;
		array2[3] = 59;
		array2[4] = 60;
		
		boolean b1 = Arrays.equals(array1, array2);
		
		if(b1==true) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both arrays are not equal");
		}
	}

}
