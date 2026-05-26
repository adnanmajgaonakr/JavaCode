package basic.advance;

public class GlobalVariablesUpdate {
	
	int noOfMonths = 12;
	static int noOfHours = 24;
	
	public static void updateValues() {
		
		GlobalVariablesUpdate g1 = new GlobalVariablesUpdate();
		System.out.print("Updated value of non static variable is : ");
		System.out.println(g1.noOfMonths = 15);
		
		int noOfHours = 30;
		System.out.println("Updated value of static variable is : "+ noOfHours);
	}
	
	public static void main(String[] args) {
		updateValues();
		
	}

}
