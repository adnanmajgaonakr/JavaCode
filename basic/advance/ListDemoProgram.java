package basic.advance;
import java.util.ArrayList;
import java.util.List;

public class ListDemoProgram {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();

        // Adding elements to the List
        names.add("Adnan");
        names.add("Rahul");
        names.add("Sameer");
        names.add("Imran");

        // Adding element at a specific index
        names.add(2, "Zaid");

        // Displaying the List
        System.out.println("List: " + names);

        // Retrieving element at index
        System.out.println("Element at index 1: " + names.get(1));

        // Updating an element
        names.set(0, "Adnan M.");
        System.out.println("After updating index 0: " + names);

        // Removing by index
        names.remove(3);  
        System.out.println("After removing index 3: " + names);

        // Removing by value
        names.remove("Zaid");
        System.out.println("After removing 'Zaid': " + names);

        // Checking if element exists
        System.out.println("Contains Sameer? " + names.contains("Sameer"));

        // Size of List
        System.out.println("Size: " + names.size());

        // Clearing the List
        names.clear();
        System.out.println("After clear(): " + names);
    }

}
