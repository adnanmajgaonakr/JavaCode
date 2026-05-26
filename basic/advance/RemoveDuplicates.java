package basic.advance;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 10, 30, 40, 20, 50};

        System.out.println("Array without duplicates:");

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check if element appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if it's not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
	}
}
