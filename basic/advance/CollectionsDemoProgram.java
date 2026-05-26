package basic.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoProgram {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        // 1. sort() - Ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (ASC): " + numbers);

        // 2. reverse() - Reverse order
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // 3. shuffle() - Random order
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // 4. min() - Smallest element
        System.out.println("Minimum: " + Collections.min(numbers));

        // 5. max() - Largest element
        System.out.println("Maximum: " + Collections.max(numbers));

        // 6. frequency() - Count how many times a value appears
        numbers.add(20);
        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20));

        // 7. swap() - Swap two elements
        Collections.swap(numbers, 0, 2);
        System.out.println("After swapping index 0 & 2: " + numbers);

        // 8. replaceAll() - Replace a value
        Collections.replaceAll(numbers, 20, 200);
        System.out.println("After replaceAll(20 - 200): " + numbers);

        // 9. fill() - Replace all values with one value
        Collections.fill(numbers, 999);
        System.out.println("After fill(999): " + numbers);

        // Making a list for copy() method
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        // 10. copy() - Copy list2 into list1 (sizes must match)
        Collections.copy(list1, list2);
        System.out.println("After copy(list2 → list1): " + list1);

        // 11. binarySearch() → works only on sorted list
        Collections.sort(list1);
        int index = Collections.binarySearch(list1, 30);
        System.out.println("Binary Search for 30: found at index " + index);
	}
}
