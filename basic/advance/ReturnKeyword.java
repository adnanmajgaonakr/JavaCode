package basic.advance;

public class ReturnKeyword {

	static int addNumber(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Addition is : " + addNumber(30, 34, 78));
		}
	}
