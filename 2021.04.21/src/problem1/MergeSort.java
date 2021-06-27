package problem1;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"f", "z", "l","p","e"};
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.compareTo(o2)>0) return 1;
				else if(o1.compareTo(o2)<0) return -1;
				return 0;
			}
		};
		mergeSort(list, c);
		System.out.println(Arrays.toString(list));
		String[] list2 = {"k", "m", "l","p","e"};
		mergeSort(list2);
		System.out.println(Arrays.toString(list2));
	}
	
	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if(list.length>1) {
		//	E[] firstHalf = (E[]) java.lang.reflect.Array.newInstance(, list.length/2);
			E[] firstHalf = (E[]) new Comparable[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			//System.out.println(Arrays.toString(firstHalf)+comparator.compare(firstHalf[0], firstHalf[1]));
			mergeSort(firstHalf);
			
			E[] secondHalf = (E[]) new Comparable[list.length - list.length/2];
			System.arraycopy(list, list.length/2, secondHalf, 0, list.length - list.length/2);
			mergeSort(secondHalf);
			
			merge(firstHalf, secondHalf, list);
		}
	}

	private static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
		// TODO Auto-generated method stub
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1].compareTo(list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
		if(list.length>1) {
			E[] firstHalf = (E[]) new Object[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			//System.out.println(Arrays.toString(firstHalf)+comparator.compare(firstHalf[0], firstHalf[1]));
			mergeSort(firstHalf, comparator);
			
			E[] secondHalf = (E[]) new Object[list.length - list.length/2];
			System.arraycopy(list, list.length/2, secondHalf, 0, list.length - list.length/2);
			mergeSort(secondHalf, comparator);
			
			merge(firstHalf, secondHalf, list, comparator);
		}
		
	}

	public static <E> void merge(E[] list1, E[] list2, E[] temp, Comparator<? super E> comparator) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (comparator.compare(list1[current1], list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
}
