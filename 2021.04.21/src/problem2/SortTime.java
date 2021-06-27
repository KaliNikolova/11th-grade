package problem2;

import java.util.*;

public class SortTime {

	public static void bubbleSort(int[] list) {
		for (int k = 0; k < list.length - 1; k++) {
			for (int i = 0; i < list.length - 1 - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	public static void mergeSort(int[] list) {
		if (list.length > 1) {
// Merge sort the first half
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	public static void merge(int[] list1, int[] list2, int[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		while (high > low) {
// Search forward from left
			while (low <= high && list[low] <= pivot)
				low++;
//Search backward from right
			while (low <= high && list[high] > pivot)
				high--;
//Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while (high > first && list[high] >= pivot)
			high--;
//Swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	public static void sortTime(int[] list) {
		int[] list1 = list.clone();
		int[] list2 = list.clone();
		int[] list3 = list.clone();
		int[] list4 = list.clone();
		long startTime = System.currentTimeMillis();
		selectionSort(list1);
		long selectionSortTime = System.currentTimeMillis() - startTime;
		startTime = System.currentTimeMillis();
		bubbleSort(list1);
		long bubbleSortTime = System.currentTimeMillis() - startTime;
		startTime = System.currentTimeMillis();
		mergeSort(list1);
		long mergeSortTime = System.currentTimeMillis() - startTime;
		startTime = System.currentTimeMillis();
		// quickSort(list1);
		long quickSortTime = System.currentTimeMillis() - startTime;
		System.out.printf("%10d %18d %18d %18d %30s\n", list.length, selectionSortTime, bubbleSortTime, mergeSortTime,
				"java.lang.StackOverflowError");
	}

	public static void main(String[] args) {
		System.out.printf("%10s %18s %18s %18s %30s\n", "Array size", "Selection Sort", "Bubble Sort", "Merge Sort",
				"Quick Sort");
		for (int i = 50000; i <= 300000; i += 50000) {
			int[] list = createArray(i);
			sortTime(list);
		}
	}

	public static int[] createArray(int length) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		int[] arr = new int[length];
		int i = 0;
		for (Integer elem : list) {
			arr[i] = elem;
			i++;
		}
		return arr;
	}
}
