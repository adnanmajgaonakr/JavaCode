package batch65.java.programs;
import java.util.Date;
import java.util.Scanner;

public class DateProgram {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		//System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println("Current Date and Time is : " +d2);
		
		String s1 = d2.toString();
		String month = s1.substring(4,7);
		String date = s1.substring(8, 10);
		String hour = s1.substring(11, 13);
		String min = s1.substring(14, 16);
		String sec = s1.substring(17, 19);
		String year = s1.substring(s1.length()-4);
		
		String currentDateFormat = date.concat("/").concat(month)
				.concat("/").concat(year);
		System.out.println("Current Date in new format : " 
				+currentDateFormat);
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter the days for future and past date : ");
		int input = s2.nextInt();
		
		Date d3 = new Date(d1.getTime() + (1000*60*60*24*input));
		System.out.println("Future Date and Time after " +input+ 
				" days is : " +d3);
		
		String s3 = d3.toString();
		String month1 = s3.substring(4,7);
		String date1 = s3.substring(8, 10);
		String hour1 = s3.substring(11, 13);
		String min1 = s3.substring(14, 16);
		String sec1 = s3.substring(17, 19);
		String year1 = s3.substring(s3.length()-4);
		
		String futureDateFormat = date1.concat("/").concat(month1)
				.concat("/").concat(year1);
		System.out.println("Future Date in new format : " 
				+futureDateFormat);
		
		Date d4 = new Date(d1.getTime() - (1000*60*60*24*input));
		System.out.println("Past Date and Time after " +input+ " "
				+ "days is : " +d4);
		
		String s4= d4.toString();
		String month2 = s4.substring(4,7);
		String date2 = s4.substring(8, 10);
		String hour2 = s4.substring(11, 13);
		String min2 = s4.substring(14, 16);
		String sec2 = s4.substring(17, 19);
		String year2 = s4.substring(s4.length()-4);
		
		String pastDateFormat = date2.concat("/").concat(month2)
				.concat("/").concat(year2);
		System.out.println("Past Date in new format : " +pastDateFormat);
		
		s2.close();
	}
}
