package batch65.java.programs;
import java.util.Scanner;

public class ForLoop4 {

	Scanner s1 = new Scanner(System.in);
	
	void calculateSum() {
		
		System.out.println("Enter the number till where you want to calculate sum :");
		int n = s1.nextInt();
		int sum = 0;
		if(n >= 0) {
			for(int i=0; i<=n; i++) {
				sum = sum + i;
			}
			System.out.println("Sum of first " + n + " numbers is : " + sum);
		}
		else {
			System.out.println("Please enter positive number.");
		}
	}
	
	public static void main(String[] args) {
		
		ForLoop4 f1 = new ForLoop4();
		f1.calculateSum();
	}
}
