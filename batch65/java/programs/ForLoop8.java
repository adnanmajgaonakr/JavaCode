package batch65.java.programs;

public class ForLoop8 {

	static char c1;
	
	public static void main(String[] args) {
		
		String input = "10 March 2026 20 53 46";
		
		String [] array1 = input.split(" ");
		String[] labels = {
	            "Todays date is: ",
	            "Month is: ",
	            "Year is: ",
	            "Hour is: ",
	            "Min is: ",
	            "Sec is: "
	        };
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(labels[i] + array1[i]);
		}
	}
}
