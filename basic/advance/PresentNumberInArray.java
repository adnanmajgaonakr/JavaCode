package basic.advance;

public class PresentNumberInArray {
	
	public static void main(String[] args) {
		
		int [] age = new int [5];
		age[0] = 25;
		age[1] = 31;
		age[2] = 18;
		age[3] = 20;
		age[4] = 63;
		
		int expectedNumber = 63;
		
		for(int i=0; i<age.length; i++) {
			
			if(age[i]==expectedNumber) {
				System.out.println(expectedNumber+ " number is present in the array at index position " +i);
			}
		}
	}
}
