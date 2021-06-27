package problem2;

public class QueueOfIntegers {

	int[] elements;
	int size = 0;

	public QueueOfIntegers() {
		elements = new int[8];
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int temp[] = new int[size * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int r = elements[0];
		int[] temp = new int[elements.length - 1];
		System.arraycopy(elements, 1, temp, 0, elements.length - 1);
		elements = temp;
		return r;
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
