package problem1;

import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberOfObjects("OLTOOTLO"));
	}
	
	public static int numberOfObjects(String str) {
		Stack<Character> stack = new Stack<>();
		char ch;
		for(int i =0; i<str.length();i++) {
			ch = str.charAt(i);
			if(stack.isEmpty()) stack.push(ch);
			else if(ch == 'L') stack.push(ch);
			else if(ch == 'O') {
				if(stack.peek() == 'T' || stack.peek() == 'O') stack.push(ch);
			}
			else if(ch == 'T') {
				while(stack.peek() == 'O') stack.pop();
				stack.push(ch);
			}
		}
		return stack.size();
	}

}
