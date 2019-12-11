package arrayStuff;

import java.util.Arrays;

public class Ex74 {
	public static void main(String[] args) {
		// Using '.length' allows to change the length of the first array and that will
		// adapt the calculations to it.
		int[] before = new int[10]; // The array before reversing the elements.
		int[] after = new int[before.length]; // The array after reversing the elements. Settings its length identical
												// to the before array.
		for (int i = 0; i < before.length; i++) { // Setting values for the elements of the array.
			before[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(before)); // Printing the array before.

		int m = 0; // Setting a counter for the 'while' loop.
		while (m < before.length) {
			for (int n = after.length - 1; n >= 0; n--) { // Going from the last element of the after array and from the
															// first element of the before array.
				after[n] = before[m];
				m++;
			}
		}
		System.out.println(Arrays.toString(after)); // Printing the array after.
	}

}
