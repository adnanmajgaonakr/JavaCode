package batch65.java.programs;

public class MathClass {

	public static void main(String[] args) {
		
		double piValue = Math.PI;
		System.out.println("The value of pi from Math class is : " + piValue);
		
		double randomValue = Math.random();
		System.out.println("Random value from Math class is : " + randomValue);
		
		int addition1 = Math.addExact(34, 45);
		System.out.println("Addition of parameter is : " + addition1);
		
		long addition2 = Math.addExact(265232334, 942145566);
		System.out.println("Addition of parameter is : " + addition2);
	}
}
