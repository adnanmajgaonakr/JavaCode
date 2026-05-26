package batch65.java.programs;

public class MathClassMethods {

	public static void main(String[] args) {
		
		int sub1 = Math.subtractExact(450, 22);
		System.out.println("Subtraction of int and int  parameters is : " + sub1);
		
		long sub2 = Math.subtractExact(54554644l, 9877696988l);
		System.out.println("Subtraction of long and long parameters is : " + sub2);
		
		long mul1 = Math.multiplyExact(554668645544l, 456);
		System.out.println("Multiplication of long and int parameters is : " + mul1);
		
		long mul2 = Math.multiplyExact(5564567877656544l, 45636745687342l);
		System.out.println("Multiplication of long and long parameters is : " + mul2);
		
		int mul3 = Math.multiplyExact(668, 4342);
		System.out.println("Multiplication of int and int parameters is : " + mul3);
		
		int max1 = Math.max(978, 4567);
		System.out.println("Maximum number from int parameters is : " + max1);
		
		float max2 = Math.max(9.48f, 45.67f);
		System.out.println("Maximum number from float parameters is : " + max2);
		
		double max3 = Math.max(97.83453224, 45.6756244122);
		System.out.println("Maximum number from double parameters is : " + max3);
		
		long max4 = Math.max(465679880553l, 9986532656896l);
		System.out.println("Maximum number from long parameters is : " + max4);
		
		int min1 = Math.min(978, 4567);
		System.out.println("Minimum number from int parameters is : " + min1);
		
		float min2 = Math.max(9.48f, 45.67f);
		System.out.println("Minimum number from float parameters is : " + min2);
		
		double min3 = Math.max(97.83453224, 45.6756244122);
		System.out.println("Minimum number from double parameters is : " + min3);
		
		long min4 = Math.max(465679880553l, 9986532656896l);
		System.out.println("Minimum number from long parameters is : " + min4);
		
		int abs1 = Math.abs(-45645634);
		System.out.println("Absolute value of entered value is : " + abs1);
		
		float abs2 = Math.abs(-76.343665f);
		System.out.println("Absolute value of entered value is : " + abs2);
		
		long abs3 = Math.abs(8574463554745324l);
		System.out.println("Absolute value of entered value is : " + abs3);
		
		double abs4 = Math.abs(67.34235424574532452462);
		System.out.println("Absolute value of entered value is : " + abs4);
		
		
	}
}
