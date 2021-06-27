package problem3;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Number> q = new Queue<Number>();
		q.enqueue(new Integer(2));
		q.enqueue(new Double(2.3));
		System.out.println(q.dequeue());
		System.out.println(q.getSize());
		System.out.println(q.empty());
		System.out.println(q.dequeue());
		System.out.println(q.empty());
	}

}
