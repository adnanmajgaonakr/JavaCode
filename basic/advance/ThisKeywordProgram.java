package basic.advance;

public class ThisKeywordProgram {

	static int stdId = 1234;
	static double sal = 765437;
	static String name = "Adnan Majgaonkar";
	
	void studentHostel(int stdId, double sal, String name) {
		
		System.out.println("Values of global variables are : ");
		System.out.println(ThisKeywordProgram.stdId + ", " + 
				           ThisKeywordProgram.sal + ", " +
				           ThisKeywordProgram.name);
		
		this.stdId = stdId;
		this.sal = sal;
		this.name = name;
		
		System.out.println("After updating the values of global variables are : ");
		System.out.println(ThisKeywordProgram.stdId + ", " + 
				           ThisKeywordProgram.sal + ", " +
				           ThisKeywordProgram.name);
	}
	public static void main(String[] args) {
		
		ThisKeywordProgram t1 = new ThisKeywordProgram();
		t1.studentHostel(4567, 9456734, "Adnan Yakub Majgaonkar");
	}
}
