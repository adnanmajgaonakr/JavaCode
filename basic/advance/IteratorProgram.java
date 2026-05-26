package basic.advance;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		a1.add(25);
		a1.add(76);
		a1.add(87);
		a1.add(61);
		
		Iterator<Integer> i1 =a1.iterator();
		System.out.println("After iterating through the ArrayList :");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
}
