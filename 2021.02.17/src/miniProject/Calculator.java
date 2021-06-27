package miniProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JPanel panel = new JPanel();
	private JTextField txt = new JTextField();
	private String display = "";

	public Calculator() {
		// TODO Auto-generated constructor stub

		super("Calculator");
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		JButton b7 = new JButton("7");
		panel.add(b7);
		JButton b8 = new JButton("8");
		panel.add(b8);
		JButton b9 = new JButton("9");
		panel.add(b9);
		JButton bDiv = new JButton("/");
		panel.add(bDiv);
		JButton b4 = new JButton("4");
		panel.add(b4);
		JButton b5 = new JButton("5");
		panel.add(b5);
		JButton b6 = new JButton("6");
		panel.add(b6);
		JButton bMul = new JButton("*");
		panel.add(bMul);
		JButton b1 = new JButton("1");
		panel.add(b1);
		JButton b2 = new JButton("2");
		panel.add(b2);
		JButton b3 = new JButton("3");
		panel.add(b3);
		JButton bSub = new JButton("-");
		panel.add(bSub);
		JButton b0 = new JButton("0");
		panel.add(b0);
		JButton bPoint = new JButton(".");
		panel.add(bPoint);
		JButton bEqual = new JButton("=");
		panel.add(bEqual);
		JButton bSum = new JButton("+");
		panel.add(bSum);
		add(panel, BorderLayout.CENTER);
		txt.setPreferredSize(new Dimension(0, 30));
		add(txt, BorderLayout.NORTH);

		ListenToDigit lDigit = new ListenToDigit();
		b1.addActionListener(lDigit);
		b2.addActionListener(lDigit);
		b3.addActionListener(lDigit);
		b4.addActionListener(lDigit);
		b5.addActionListener(lDigit);
		b6.addActionListener(lDigit);
		b7.addActionListener(lDigit);
		b8.addActionListener(lDigit);
		b9.addActionListener(lDigit);
		b0.addActionListener(lDigit);

		ListenToOperation lOperation = new ListenToOperation();
		bSum.addActionListener(lOperation);
		bSub.addActionListener(lOperation);
		bMul.addActionListener(lOperation);
		bDiv.addActionListener(lOperation);
		bPoint.addActionListener(new ListenToPoint());
		bEqual.addActionListener(new ListenToSolve());

	}

	class ListenToDigit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txt.getText() + ((JButton)e.getSource()).getText().charAt(0);
			txt.setText(display);
		}
	}


	class ListenToOperation implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = changeLastSymbol(txt.getText(), ((JButton)e.getSource()).getText().charAt(0));
			txt.setText(display);

		}
	}

	class ListenToPoint implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = changeLastSymbol(txt.getText(), '.');
			txt.setText(display);
		}
	}
	
	public static String changeLastSymbol(String str, char sign) {
		if (str.length() > 0 && (str.charAt(str.length() - 1) == '+'
				|| str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-'
				|| str.charAt(str.length() - 1) == '*' || str.charAt(str.length() - 1) == '/' || str.charAt(str.length() - 1) == '.')) {
			return str.substring(0, str.length() - 1)+sign;
		}else return str+sign;
	}

	class ListenToSolve implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txt.getText() + "=";
			if (display.length() > 1) {
				for (int i = 0; i < display.length() - 1; i++) {
					if ((display.charAt(i) > '9' || display.charAt(i) < '0')
							&& (display.charAt(i + 1) > '9' || display.charAt(i + 1) < '0')) {
						txt.setText("Invalid input");
						// return;
					}
				}
			}
			txt.setText(display + dResult(display));
			setVisible(false);
			dispose();
			JDialog message = new JDialog(new Calculator(), "Equation");
			message.setVisible(true);
			message.setLocationRelativeTo(null);
			message.setSize(500, isValid(display) ? 100 : 150);
			JLabel lbl = new JLabel(
					isValid(display) ? display + dResult(display) : "<html>" + display + "<br>Invalid input</html>");
			lbl.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			message.add(lbl, BorderLayout.CENTER);
			lbl.setHorizontalAlignment(JLabel.CENTER);
		}

	}

	public static boolean isValid(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) < '0' || str.charAt(i) > '9') && (str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9')) {
				return false;
			}
			if((str.charAt(i) < '0' || str.charAt(i) > '9')&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/'&&str.charAt(i)!='.'&&str.charAt(i)!='=') return false;
		}
		return true;
	}

//	public static double result(String str) {
//		double num1 = 0;
//		double num2 = 0;
//		boolean b = true;
//		char[] arr = str.toCharArray();
//		for (int i = 0, j = 0; i < arr.length; i++) {
//			if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/' || arr[i] == '=') {
//				b = false;
//				j = i;
//				while (true) {
//					j--;
//					if (j < 0)
//						break;
//					if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/') {
//						switch (arr[j]) {
//						case '+':
//							num1 = num1 + num2;
//							break;
//
//						case '-':
//							num1 = num1 - num2;
//							break;
//
//						case '*':
//							num1 = num1 * num2;
//							break;
//
//						case '/':
//							num1 = num1 / num2;
//							break;
//						default:
//							break;
//						}
//						break;
//					}
//				}
//				num2 = 0;
//			} else {
//				if (b) {
//					num1 = num1 * 10 + (arr[i] - '0');
//				} else {
//					num2 = num2 * 10 + (arr[i] - '0');
//				}
//			}
//		}
//		return num1;
//	}

	public static double dResult(String str) {
		char[] arr = str.toCharArray();
		ArrayList<Integer> oper = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '+' || arr[i] == '*' || arr[i] == '-' || arr[i] == '/' || arr[i] == '=') {
				oper.add(i);
			} else if (arr[i] < '0' && arr[i] > '9' && arr[i] == '.') {
				return 0;
			}
		}
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(Double.parseDouble(str.substring(0, oper.get(0))));
		for (int i = 0; i < oper.size() - 1; i++) {
			if (oper.get(i) != oper.get(i + 1) - 1) {
				numbers.add(Double.parseDouble(str.substring(oper.get(i) + 1, oper.get(i + 1))));
			} else {
				return 0;
			}
		}
		int i = 0;
		while (i < oper.size()) {
			if (arr[oper.get(i)] == '*') {
				numbers.set(i, (numbers.get(i) * numbers.get(i + 1)));
				numbers.remove(i + 1);
				oper.remove(i);
			} else if (arr[oper.get(i)] == '/') {
				numbers.set(i, (numbers.get(i) / numbers.get(i + 1)));
				numbers.remove(i + 1);
				oper.remove(i);
			} else {
				i++;
			}
		}
		i = 0;
		while (i < oper.size()) {
			if (arr[oper.get(i)] == '+') {
				numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
				numbers.remove(i + 1);
				oper.remove(i);
			} else if (arr[oper.get(i)] == '-') {
				numbers.set(i, (numbers.get(i) - numbers.get(i + 1)));
				numbers.remove(i + 1);
				oper.remove(i);
			} else {
				i++;
			}
		}
		return numbers.get(0);
	}
}
