package selectiontry;

public class Selection {

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = { 10, 34, 2, 56, 7, 67, 88, 42, 1, -1, 425 };
		int[] sortedArray = doSelectionSort(array);
		for (int i : sortedArray) {
			System.out.print(i);
			System.out.print(", ");
		}

	}

	public static void swapMyNumbers(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

}
