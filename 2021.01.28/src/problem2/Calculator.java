package problem2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
public class Calculator extends JFrame {
	
	private JPanel panel = new JPanel();
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
	JTextField txt = new JTextField();
	txt.setPreferredSize(new Dimension(0,30));
	add(txt, BorderLayout.NORTH);
	}
	
}
