package problem1;

public class StackOfChars {

	private char[] elements;
	private int size = 0;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfChars() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfChars(int capacity) {
		elements = new char[capacity];
	}

	public void push(char value) {
		if (size >= elements.length) {
			char[] temp = new char[2 * size];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	public char pop() {
			return elements[--size];

	}

	public int peek() {
		return elements[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}
}
