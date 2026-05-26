package batch65.java.programs;
import java.util.Scanner;

public class SwitchCaseProgram {

	Scanner s1 = new Scanner(System.in);
	
	void checkVowels() {
		System.out.println("Enter an alphabet to check whether it is a vowel :");
		char alphabet = s1.next().charAt(0);
		
		switch(alphabet) {
		
		case 'a' :
			System.out.println("It is VOWEL.");
			break;
		case 'e' :
			System.out.println("It is VOWEL.");
			break;
		case 'i' :
			System.out.println("It is VOWEL.");
			break;
		case 'o' :
			System.out.println("It is VOWEL.");
			break;
		case 'u' :
			System.out.println("It is VOWEL.");
			break;
		case 'A' :
			System.out.println("It is VOWEL.");
			break;
		case 'E' :
			System.out.println("It is VOWEL.");
			break;
		case 'I' :
			System.out.println("It is VOWEL.");
			break;
		case 'O' :
			System.out.println("It is VOWEL.");
			break;
		case 'U' :
			System.out.println("It is VOWEL.");
			break;
		default :
			System.out.println("It is CONSTANT.");
			break;
		}
	}
	public static void main(String[] args) {
		SwitchCaseProgram sw = new SwitchCaseProgram();
		sw.checkVowels();
	}
}
