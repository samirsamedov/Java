package binary;

import java.util.Arrays;

public class MyBinarySearch {

	public static void main(String[] args) {
		int myArray[] = { 30, 20, 5, 12, 55, 201, 5, 56, 98, 102, 23, 65 };

		Arrays.sort(myArray);

		for (int number : myArray) {
			System.out.print(" " + number);
		}
		System.out.print("\n");
		int searchThis = 102;
		// my binary search

		boolean result = myBinarySearch(myArray, searchThis);
		System.out.println("The Existance is : " + result);
		// Java Binary Search
		int retVal = Arrays.binarySearch(myArray, searchThis);
		System.out.println("The index of element is : " + retVal);

	}

	public static boolean myBinarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (high >= low) {
			int middle = (high + low) / 2;
			if (key == array[middle])
				return true;
			if (key > array[middle])
				low = middle + 1;
			if (key < array[middle])
				high = middle - 1;
		}
		return false;
	}

}
