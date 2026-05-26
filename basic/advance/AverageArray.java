package basic.advance;

public class AverageArray {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int [] array1 = new int[4];
		array1[0] = 14;
		array1[1] = 23;
		array1[2] = 56;
		array1[3] = 26;
		
		for(int i=0; i<array1.length; i++) {
			
			sum = sum + array1[i];
		}
		System.out.println("Sum of all the elements of array is : "+sum);
		
		double average = sum/array1.length;
		System.out.println("Average of all the elements of array is : "+average);
	}

}
