package batch65.java.programs;
public class FinalVariable {

	final static double pi = 3.14;
	
	static void AreaOfCircle() {
		final double r = 20.45;
		double area = pi*r*r;
		System.out.println("Area of circle is : " + area);
	}
	
	public static void main(String[] args) {
		AreaOfCircle();
	}
}
