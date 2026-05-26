package basic.advance;

public class MathClass {
	
	public static void add() {
		
		System.out.println(Math.addExact(20, 30));
		System.out.println(Math.addExact(300, 200));
	}
	
	public static void sub() {
		
		System.out.println(Math.subtractExact(300, 150));
		System.out.println(Math.subtractExact(550, 135));
	}
	
	public static void mul() {
		
		System.out.println(Math.multiplyExact(34, 56));
		System.out.println(Math.multiplyExact(3456, 23));
	}
	
	public static void min() {
		
		System.out.println(Math.min(345.56, 23.457));
		System.out.println(Math.min(34.65, 23.45686876));
		System.out.println(Math.min(67, 87));
		System.out.println(Math.min(56, 19));
	}
	
	public static void max() {
		
		System.out.println(Math.max(745.2345, 976.345));
		System.out.println(Math.max(56.43, 78.67));
		System.out.println(Math.max(78, 65));
		System.out.println(Math.max(4536765, 9876435));
	}
	
	public static void abs() {
		
		System.out.println(Math.abs(345.5678));
		System.out.println(Math.abs(765.67667));
		System.out.println(Math.abs(34));
		System.out.println(Math.abs(974356346));
	}
	
	public static void sqrt() {
		
		System.out.println(Math.sqrt(81));
	}
	
	public static void areaOfCircle() {
		
		int r = 20;
		
		System.out.println("Area of circle : "+ Math.PI*r*r);
	}

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		min();
		max();
		abs();
		sqrt();
		areaOfCircle();
	}

}
