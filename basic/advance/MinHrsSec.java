package basic.advance;

import java.util.Date;

public class MinHrsSec {
	
	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println("Current Time is : " +d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println("Current Date and Time is : "+ d2);
		
		String dateFormat = d2.toString();
		
		String hrs = dateFormat.substring(11,13);
		System.out.println("Current hours are : " +hrs);
		
		String min = dateFormat.substring(14,16);
		System.out.println("Current minutes are : " +min);
		
		String sec = dateFormat.substring(17,19);
		System.out.println("Current hours are : " +sec);
	}

}
