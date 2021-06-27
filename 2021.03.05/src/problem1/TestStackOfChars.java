package problem1;

import java.util.Scanner;

public class TestStackOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StackOfChars stack = new StackOfChars();
		boolean valid = true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			}else if(str.charAt(i) == ')') {
				if(stack.getSize()<=0 || stack.pop() != '(') {
					System.out.println("Invalid");
					valid = false;
					break;
				}
			}else if(str.charAt(i) == '}') {
				if(stack.getSize()<=0 || stack.pop() != '{') {
					System.out.println("Invalid");
					valid = false;
					break;
				}
			}else if(str.charAt(i) == ']') {
				if(stack.getSize()<=0 || stack.pop() != '[') {
					System.out.println("Invalid");
					valid = false;
					break;
				}
			}else {
				System.out.println("Invalid");
				valid = false;
				break;
			}
		}
		if(stack.empty() && valid) System.out.println("Valid");
		if(valid && !stack.empty()) System.out.println("Invalid");
	}

}
