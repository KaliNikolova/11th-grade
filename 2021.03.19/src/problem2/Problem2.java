package problem2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.add("George");
		queue1.add("Jim");
		queue1.add("John");
		queue1.add("Blake");
		queue1.add("Kevin");
		queue1.add("Michael");

		PriorityQueue<String> queue2 = new PriorityQueue<>();
		queue2.add("George");
		queue2.add("Katie");
		queue2.add("Kevin");
		queue2.add("Michelle");
		queue2.add("Ryan");
		System.out.println(Arrays.toString(intersection(queue1, queue2).toArray()));
		System.out.println(Arrays.toString(union(queue1, queue2).toArray()));
		System.out.println(Arrays.toString(difference(queue1, queue2).toArray()));
	}

	public static PriorityQueue<String> intersection(PriorityQueue<String> q1, PriorityQueue<String> q2) {
		PriorityQueue<String> queue1 = copy(q1);
		PriorityQueue<String> queue2 = copy(q2);
		PriorityQueue<String> result = new PriorityQueue<>();
		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			if (queue1.peek().equals(queue2.peek())) {
				result.add(queue1.poll());
				queue2.poll();
			} else if (queue1.peek().compareTo(queue2.peek()) < 0)
				queue1.poll();
			else
				queue2.poll();
		}
		return result;
	}
	
	public static PriorityQueue<String> copy(PriorityQueue<String> queue){
		PriorityQueue<String > result = new PriorityQueue<>();
		for(String elem: queue) {
			result.add(elem);
		}
		return result;
 	}

	public static PriorityQueue<String> union(PriorityQueue<String> q1, PriorityQueue<String> q2) {
		PriorityQueue<String> queue1 = copy(q1);
		PriorityQueue<String> queue2 = copy(q2);
		PriorityQueue<String> result = new PriorityQueue<>();
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (queue1.isEmpty())
				result.add(queue2.poll());
			else if (queue2.isEmpty())
				result.add(queue1.poll());
			else {
				if (queue1.peek().equals(queue2.peek())) {
					result.add(queue1.poll());
					queue2.poll();
				} else if (queue1.peek().compareTo(queue2.peek()) < 0)
					result.add(queue1.poll());
				else
					result.add(queue2.poll());
			}
		}
		return result;
	}
	
	public static PriorityQueue<String> difference(PriorityQueue<String> q1, PriorityQueue<String> q2) {
		PriorityQueue<String> queue1 = copy(q1);
		PriorityQueue<String> queue2 = copy(q2);
		PriorityQueue<String> result = new PriorityQueue<>();
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (queue1.isEmpty())
				result.add(queue2.poll());
			else if (queue2.isEmpty())
				result.add(queue1.poll());
			else {
				if (queue1.peek().equals(queue2.peek())) {
					queue1.poll();
					queue2.poll();
				} else if (queue1.peek().compareTo(queue2.peek()) < 0)
					result.add(queue1.poll());
				else
					result.add(queue2.poll());
			}
		}
		return result;
	}
}
