package problem3;

import java.util.ArrayList;

public class Queue<E> {

	private ArrayList<E> elements;
	private int size = 0;

	public Queue() {
		elements = new ArrayList<>();
	}

	public void enqueue(E v) {
		elements.add(v);
		size++;
	}

	public E dequeue() {
		if (size > 0) {
			E r = elements.get(0);
			size--;
			for (int i = 0; i < size; i++) {
				elements.set(i, elements.get(i + 1));
			}
			elements.remove(size);
			return r;

		}
		return null;
	}

	public boolean empty() {
		if (size == 0)
			return true;
		return false;
	}

	public int getSize() {
		return size;
	}
}
