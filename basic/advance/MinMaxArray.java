package basic.advance;

import java.util.Arrays;

public class MinMaxArray {
	
	public static void main(String[] args) {
		 int array[]=new int[5];
         array[0]=30;
         array[1]=25;
         array[2]=1;
         array[3]=90;
         array[4]=99;
         
         System.out.println(Arrays.toString(array));
         int min = array[0];
         int max = array[0];
         
         for(int i=0; i<array.length; i++) {
        	 if(array[i]<min) {
        		 min = array[i];
        	 }
        	 if(array[i]>max) {
        		 max = array[i];
        	 } 
         }
         
         System.out.println("The highest value is : "+max);
         System.out.println("The minimum value is : "+min);
	}

}
