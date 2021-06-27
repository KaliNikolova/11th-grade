package problem1;

import java.util.Arrays;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		System.out.println(postfix("1 2+3*"));
		System.out.println(infixToPostfix("2 * (1 + 3)"));
	}

	public static double postfix(String str) {
		str = insertBlanks(str);
		String[] arr = str.split(" ");
		Stack<Double> stack = new Stack<>();
		for (String tolken : arr) {
			if (tolken.equals(""))
				continue;
			if (tolken.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (tolken.equals("-")) {
				stack.push(stack.pop() - stack.pop());
			} else if (tolken.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (tolken.equals("/")) {
				stack.push(stack.pop() / stack.pop());
			} else if (tolken.equals("^")) {
				stack.push(Math.pow(stack.pop(), stack.pop()));
			} else {
				stack.push(Double.valueOf(tolken));
			}
		}
		return stack.pop();
	}

	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '^' || s.charAt(i) == '+'
					|| s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
				if (i != 0 && s.charAt(i - 1) != ' ')
					result += " " + s.charAt(i) + " ";
				else if (i != s.length() - 1 && s.charAt(i + 1) != ' ')
					result += s.charAt(i) + " ";
				else
					result += " " + s.charAt(i);
			} else
				result += s.charAt(i);
		}
		return result;
	}

	public static String infixToPostfix(String expression) {
		String A = expression;
		String C = "";
		Stack<String> S = new Stack<>();
		Stack<String> help = new Stack<>();
		expression = insertBlanks(expression);
		String[] arr = expression.split(" ");
		for (String tolken : arr) {
			if (tolken.equals(""))
				continue;
			else if (tolken.equals("("))
				S.push(tolken);
			else if (tolken.equals("^"))
				S.push(tolken);
			else if (tolken.equals("*") || tolken.equals("/")) {
				while (!S.isEmpty() && S.peek().equals("^")) {
					help.push(S.pop());
				}
				S.push(tolken);
				while (!help.isEmpty())
					S.push(help.pop());
			} else if (tolken.equals("+") || tolken.equals("-")) {
				while (!S.isEmpty() && S.peek().equals("^") && S.peek().equals("*") && S.peek().equals("/")) {
					help.push(S.pop());
				}
				S.push(tolken);
				while (!help.isEmpty())
					S.push(help.pop());
			} else if (tolken.equals(")")) {
				while (!S.peek().equals("(")) {
					C += S.pop();
				}
				S.pop();
			} else
				C += Integer.valueOf(tolken);
		}
		while (!S.isEmpty() && !S.peek().equals("(")) {
			C += S.pop();
		}
		return C;
	}

}
