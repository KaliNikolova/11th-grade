package problem1;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char ch: arr) {
			if(stack.isEmpty()) stack.push(ch);
			else {
				if(ch == 'R') stack.push(ch);
				else if(ch == 'L') {
					if(stack.peek() == 'R') stack.pop();
				}else {
					System.out.println("Invalid input");
					return;
				}
			}
		}
		System.out.println(stack.size());
	}

}
