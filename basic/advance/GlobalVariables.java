package basic.advance;

public class GlobalVariables {
	
	static int noOfDays = 365;
	static int noOfHours = 24;
	
	public static void print() {
		
		System.out.println("Number of days globally declared as : "+ noOfDays);
		System.out.println("Number of hours globally declared as : "+ noOfHours);
	}
	
	public static void main(String[] arg) {
		print();
	}

}
