package problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		Problem2.shuffle(list);
		System.out.println(Arrays.toString(list.toArray()));
		Problem2.sort(list);
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(Problem2.min(list));
	}

}
