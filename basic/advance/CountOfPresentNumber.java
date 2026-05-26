package basic.advance;

import java.util.Arrays;

public class CountOfPresentNumber {
	
	static int count;
	public static void main(String[] args) {
		 int array[]=new int[5];
         array[0]=650;
         array[0]=605;
         array[0]=155;
         array[0]=265;
         array[0]=205;//this is how to update the value of a array at any index
         array[1]=302;
         array[2]=520;
         array[3]=240;
         array[4]=240;
 int numberToCheck=240;
 
         System.out.println(Arrays.toString(array));
         
         for(int i=0;i<array.length;i++)
         {
                 if(array[i]==numberToCheck)
                 {
                         System.out.print("Yes the Given Number is a part of the Array, at the index position->>>");
                         System.out.println(i);
                         count++;
                 }
         }
         System.out.println(numberToCheck + " number is present for " + count + " times");
	}

}
