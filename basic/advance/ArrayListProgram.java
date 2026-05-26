package basic.advance;

import java.util.ArrayList;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Apple");                                                            // Adding Elements
		a1.add("Banana");
		a1.add("Orange");
		a1.add("Chikoo");
		System.out.println("ArrayList is : " + a1);                                 // Printing elements of ArrayList
		System.out.println("Accessing element at index position 3: " + a1.get(3));
		a1.set(1, "Grapes");                                                        // Updating ArrayList
		System.out.println("After udating ArrayList : " + a1);
		a1.remove(3);                                                               // Removing element from ArrayList
		System.out.println("After removing ArrayList : " + a1);

	}

}
