package problem1;

import java.util.Comparator;

public class GenericHeapSort {

	public static <E extends Comparable<E>> void heapSort(E[] list) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>();

		// Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}

	/** A test method */
	public static void main(String[] args) {
		Integer[] list = { -44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53 };
		// heapSort(list);
		heapSort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1.compareTo(o2) > 0)
					return 1;
				else if (o1.compareTo(o2) < 0)
					return -1;
				return 0;
			}
		});
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}

	public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
		Heap heap = new Heap();

		// Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.addC(list[i], comparator);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = (E) heap.removeC(comparator);
	}

}
