package batch65.java.programs;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		// try switch case problem with int
		int input = 2;
		switch(input) {
		
		case 1 : System.out.println("Launching Chrome");
				 break;
		case 2 : System.out.println("Launching Firefox");
				 break;
		case 3 : System.out.println("Launching Microsoft Edge");
				 break;
		default : System.out.println("Wrong choice");
		}
		
		// try switch case problem with String
		String input1 = "Chrome";
		switch(input1) {
		
		case "Chrome" : System.out.println("Launching Chrome");
				 break;
		case "Firefox" : System.out.println("Launching Firefox");
				 break;
		case "Edge" : System.out.println("Launching Microsoft Edge");
				 break;
		default : System.out.println("Wrong choice");
		}
		
		// try switch case problem with char
		char input2 = 'e';
		switch(input2) {
		
		case 'c' : System.out.println("Launching Chrome");
				 break;
		case 'f' : System.out.println("Launching Firefox");
				 break;
		case 'e' : System.out.println("Launching Microsoft Edge");
				 break;
		default : System.out.println("Wrong choice");
		}
		
	}
}
