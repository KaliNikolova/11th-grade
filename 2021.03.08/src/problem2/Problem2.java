package problem2;

import java.util.ArrayList;

public class Problem2 {

	public static <E> void shuffle(ArrayList<E> list) {
		int rand1, rand2;
		for (int i = 0; i < list.size(); i++) {
			rand1 = (int) (Math.random() * (list.size() - 1));
			rand2 = (int) (Math.random() * (list.size() - 1));
			E e = list.get(rand1);
			list.set(rand1, list.get(rand2));
			list.set(rand2, e);
		}
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					E e = list.get(i);
					list.set(i, list.get(j));
					list.set(j, e);
				}
			}
		}
	}

	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E min = list.get(0);
		for (E element: list) {
			if (min.compareTo(element) > 0)
				min = element;
		}
		return min;
	}

}
