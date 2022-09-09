package Programs;

import java.util.Iterator;

public class Bubble_sort {

	public static void main(String[] args) {

		int[] arr = { 12, 15, 10, 9, 8, 25, 7, 9 };
		System.out.println("Before Swapping");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		int j = 1;
		while (j < arr.length) {
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
			j++;

		}

		System.out.println("after Swapping");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
