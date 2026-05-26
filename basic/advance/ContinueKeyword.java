package basic.advance;

import java.util.Arrays;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		int empId [] = new int [5];
		empId[0] = 123;
		empId[1] = 345;
		empId[2] = 765;
		empId[3] = 238;
		empId[4] = 224;
		System.out.println("Array values are : " + Arrays.toString(empId));
		for(int i=0; i<empId.length; i++) {
			if(i==3) {
				continue;
			}
		System.out.println(empId[i]);
		}
	}
}
