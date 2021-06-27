package problem2;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueOfIntegers q = new QueueOfIntegers();
		for (int i = 0; i < 20; i++) {
			q.enqueue(i);
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(q.dequeue());
		}
	}

}
