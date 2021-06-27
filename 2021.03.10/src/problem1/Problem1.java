package problem1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Problem1 extends JFrame {

	JPanel north = new JPanel();
	JPanel south = new JPanel();

	JLabel lbl = new JLabel("Enter a number:");
	JTextArea txtArea = new JTextArea(10, 60);
	JTextField txtEnter = new JTextField();

	JButton btnShuffle = new JButton("Shuffle");
	JButton btnSort = new JButton("Sort");
	JButton btnReverse = new JButton("Reverse");
	JButton btnAddNum = new JButton("Add number");

	String text = "";
	ArrayList<Double> list = new ArrayList<>();

	public Problem1() {

		this.setVisible(true);
		north.add(lbl);
		txtEnter.setPreferredSize(new Dimension(150, 25));
		north.add(txtEnter);
		north.add(btnAddNum);

		south.add(btnSort);
		south.add(btnShuffle);
		south.add(btnReverse);

		add(north, BorderLayout.NORTH);
		txtArea.setEditable(false);
		add(new JScrollPane(txtArea), BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		btnAddNum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double number = Double.parseDouble(txtEnter.getText());
					text += number + "    ";
					list.add(number);
					txtArea.setText(text);
				} catch (Exception e2) {
					// TODO: handle exception
					txtArea.setText("Enter a valid number");
				}
				txtEnter.setText("");
			}
		});

		btnSort.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Problem1.sort(list);
				text = "";
				for (Double element : list) {
					text += element + "    ";
				}
				txtArea.setText(text);
			}
		});

		btnShuffle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Problem1.shuffle(list);
				text = "";
				for (Double element : list) {
					text += element + "    ";
				}
				txtArea.setText(text);
			}
		});

		btnReverse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				reverse();
				text = "";
				for (Double element : list) {
					text += element + "    ";
				}
				txtArea.setText(text);
			}
		});
	}

	public static <E> void shuffle(ArrayList<E> list) {
		int rand1, rand2;
		for (int i = 0; i < list.size(); i++) {
			rand1 = (int) (Math.random() * list.size());
			rand2 = (int) (Math.random() * list.size());
			E e = list.get(rand1);
			list.set(rand1, list.get(rand2));
			list.set(rand2, e);
		}
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					E e = list.get(i);
					list.set(i, list.get(j));
					list.set(j, e);
				}
			}
		}
	}

	public void reverse() {
		ArrayList<Double> newList = new ArrayList<>();
		for (int i = list.size()-1; i >= 0; i--) {
			newList.add(list.get(i));
		}
		this.list = newList;
	}

	public static void main(String[] args) {
		Problem1 frame = new Problem1();
		frame.setSize(500, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
