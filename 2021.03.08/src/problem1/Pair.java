package problem1;

public class Pair<T> {

	private T first;
	private T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return first.toString() + "\n" + second.toString();
	}
}
