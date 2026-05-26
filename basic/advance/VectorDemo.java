package basic.advance;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(74);
		v1.add(31);
		v1.add(21);
		v1.add(52);
		v1.add(66);
		System.out.println("Vector values are : " + v1);
		
		System.out.println("After iteration Vector values are : ");
		Enumeration<Integer> e1 = v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
