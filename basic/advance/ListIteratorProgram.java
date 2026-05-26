package basic.advance;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorProgram {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		a1.add(25);
		a1.add(76);
		a1.add(87);
		a1.add(61);
		System.out.println("Iterating in forward direction :");
		ListIterator<Integer> l1 = a1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		System.out.println("Iterating in backward direction :");
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
	}

}
