package newCalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
public class Calculator extends JFrame {
	
	private JPanel panel = new JPanel();
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton bDiv = new JButton("/");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton bMul = new JButton("*");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton bSub = new JButton("-");
	JButton b0 = new JButton("0");
	JButton bPoint = new JButton(".");
	JButton bEqual = new JButton("=");
	JButton bSum = new JButton("+");
	JTextField txt = new JTextField();
	String display = "";
	private double cur;
	private double solve;
	private double answer;
	public char sign;
	public double result;
	
	public Calculator() {

	super("Calculator");
	panel.setLayout(new GridLayout(4, 4, 10, 10));
	panel.add(b7);
	panel.add(b8);
	panel.add(b9);
	panel.add(bDiv);
	panel.add(b4);
	panel.add(b5);
	panel.add(b6);
	panel.add(bMul);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(bSub);
	panel.add(b0);
	panel.add(bPoint);
	panel.add(bEqual);
	panel.add(bSum);
	txt.setPreferredSize(new Dimension(0,30));
	add(panel, BorderLayout.CENTER);
	add(txt, BorderLayout.NORTH);
	
	b1.addActionListener(new ListenToOne());
    b2.addActionListener(new ListenToTwo());
    b3.addActionListener(new ListenToThree());
    b4.addActionListener(new ListenToFour());
    b5.addActionListener(new ListenToFive());
    b6.addActionListener(new ListenToSix());
    b7.addActionListener(new ListenToSeven());
    b8.addActionListener(new ListenToEight());
    b9.addActionListener(new ListenToNine());
    b0.addActionListener(new ListenToZero());

    bSum.addActionListener(new ListenToAdd());
//    bSub.addActionListener(new ListenToSubtract());
//    bMul.addActionListener(new ListenToMultiply());
//    bDiv.addActionListener(new ListenToDivide());
    bEqual.addActionListener(new ListenToSolve());
    
	
	}
	
	
	
	class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "1");
        }
    }
    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "2");
        }
    }
    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "3");
        }
    }
    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "4");
        }
    }
    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "5");
        }
    }
    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "6");
        }
    }
    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "7");
        }
    }
    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "8");
        }
    }
    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "9");
        }
    }
    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "0");
        }
    }
    
    
    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //cur = Double.parseDouble(txt.getText());
            display = txt.getText();
            if(display.charAt(display.length()-1)=='+'||display.charAt(display.length()-1)=='-'||display.charAt(display.length()-1)=='*'||display.charAt(display.length()-1)=='/') {
            	display = display.substring(0, display.length()-1);
            }
            txt.setText(display+"+");
        }
        
//        public void Add() {
//        	solve = Double.parseDouble(txt.getText());
//        }
    }
    
    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//        	solve = Double.parseDouble(txt.getText());
//            double temp = cur + solve;
//            txt.setText(String.valueOf(temp));
        	int numOfDigits = 0;
        	double currentNum = 0;
        	char sign;
        	while(display!="") {
        		if(display.charAt(numOfDigits)=='+'||display.charAt(numOfDigits)=='-'||display.charAt(numOfDigits)=='*'||display.charAt(numOfDigits)=='/') {
        			sign = display.charAt(numOfDigits);
        			display = display.substring(numOfDigits+1);
        			numOfDigits= 0;
        			switch (sign) {
					case '+':
						result +=currentNum;
						break;

					default:
						break;
					}
        			currentNum =0;
        		}else {
        			numOfDigits++;
        			currentNum = Integer.parseInt(display.substring(0, numOfDigits));
        		}
        	}
        }
    }
    
//    class ListenToSubtract implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//        	cur = Double.parseDouble(txt.getText());
//            txt.setText("");
//        }
//        
//    }
//    class ListenToMultiply implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//        	cur = Double.parseDouble(txt.getText());
//            txt.setText("");
//        }
//    }
//    class ListenToDivide implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//        	cur = Double.parseDouble(txt.getText());
//            txt.setText("");
//        }
//    }
//    
//    class ListenToSolve implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//        	solve = Double.parseDouble(txt.getText());
//            double temp = cur + solve;
//            txt.setText(String.valueOf(temp));
//        }
//    }
	
}

