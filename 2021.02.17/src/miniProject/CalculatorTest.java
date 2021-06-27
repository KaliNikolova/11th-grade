package miniProject;

import javax.swing.JFrame;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		calculator.setSize(225, 250);
		calculator.setVisible(true);
        calculator.setLocationRelativeTo(null);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
