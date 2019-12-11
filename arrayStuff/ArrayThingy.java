package arrayStuff;

import java.util.Arrays;

// Ex73
public class ArrayThingy {
	public static void main(String[] args) {
		int[] randomArr = new int[10];
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 11);

		}
		System.out.println(Arrays.toString(randomArr)); // Original array.

		for (int i = 0; i < randomArr.length; i++) {
			for (int m = 0; m < i; m++) {
				if (randomArr[i] == randomArr[m]) {
					randomArr[i] = -1; // Setting duplicates to -1 as it is excluded from the values range.
				}
			}
		}
		System.out.println(Arrays.toString(randomArr)); // Original array with the duplicates changed to -1.

		int index = randomArr.length;

		for (int i = 0; i < randomArr.length; i++) { // Removing duplicates to get new array length.
			if (randomArr[i] == -1) {
				index--; // Whenever a -1 is encountered the length is reduced by 1.
			}
		}
		System.out.println(index); // Length of new array

		int[] uniqueArr = new int[index]; // The required array.

		int m = 0; // Counter for 'while' loop.
		while (m < index && uniqueArr[index - 1] == 0) { // Loop runs on the length of the new array and will break once
															// the last element is set (only if the last element is not
															// 0).
			for (int i = 0; i < randomArr.length; i++) {
				if (randomArr[i] != -1) { // Asking for the unique elements, if -1 then it was a duplicate that was
											// removed.
					uniqueArr[m] = randomArr[i]; // Setting the element in the new array to be the unique element from
													// the original array.
					m++; // After setting a new element in the new array this moves on to the next
							// element.
				}
			}
		}
		System.out.println(Arrays.toString(uniqueArr)); // New array.
	}
}
