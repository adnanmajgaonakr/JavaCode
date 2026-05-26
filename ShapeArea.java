package inheritance.programs;

abstract class CircleArea{
	abstract void AreaOfCircle();
}

public class ShapeArea extends CircleArea {

	void AreaOfCircle() {
		int r = 20;
		double area = Math.PI*r*r;
		System.out.println("Area of Cirle is : " +area);
	}
	
	public static void main(String[] args) {
		ShapeArea s1 = new ShapeArea();
		s1.AreaOfCircle();
	}

}
