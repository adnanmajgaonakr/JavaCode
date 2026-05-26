package basic.advance;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(72);
		s1.add(45);
		s1.add(67);
		s1.add(87);
		s1.add(98);
		System.out.println("Original set values are : " + s1);
		//Checking if an element exists
		System.out.println("Checking if an element exists : " + s1.contains(87));
		//Removing element
		s1.remove(45);
		System.out.println("After removing element set values are : " + s1);
		//Checking size of the set
		System.out.println("Checking size of the set : " + s1.size());
		//Checking set is empty or not
		System.out.println("Checking set is empty or not : " + s1.isEmpty());
		//Clearing the set
		s1.clear();
		System.out.println("After clearing the set values are : " + s1);
	}
}
