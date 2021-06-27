package problem2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;



	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private JButton btnMinus = new JButton("-");
	private JButton btnPlus = new JButton("+");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(btnMinus);
		panel.add(btnPlus);
		btnPlus.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		trianglePanel.setOrder(0);
		ActionListener lMinus = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(trianglePanel.getOrder()>0) trianglePanel.setOrder(trianglePanel.getOrder()-1);
			}
		};
		ActionListener lPlus = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				trianglePanel.setOrder(trianglePanel.getOrder()+1);
			}
		};
		btnMinus.addActionListener(lMinus);
		btnPlus.addActionListener(lPlus);

	}

}