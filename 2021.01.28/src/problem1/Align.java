package problem1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Align extends JFrame {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();

	public Align() {
		super("Align");

		JCheckBox cbx1 = new JCheckBox("Snap to Grid");
		JCheckBox cbx2 = new JCheckBox("Show Grid");
		Box box1 = Box.createVerticalBox();
		box1.setAlignmentX(Box.CENTER_ALIGNMENT);
		box1.add(Box.createVerticalGlue());
		box1.add(cbx1);
		box1.add(Box.createVerticalGlue());
		box1.add(cbx2);
		box1.add(Box.createVerticalGlue());

		JLabel lblX = new JLabel("X: ");
		JLabel lblY = new JLabel("Y: ");
		JTextField txtX = new JTextField();
		JTextField txtY = new JTextField();
		txtX.setPreferredSize(new Dimension(30, 20));
		txtY.setPreferredSize(new Dimension(30, 20));
		panel1.add(lblX);
		panel1.add(txtX);
		panel2.add(lblY);
		panel2.add(txtY);
		Box box2 = Box.createVerticalBox();
		box2.setAlignmentX(Box.CENTER_ALIGNMENT);
		box2.add(Box.createVerticalGlue());
		box2.add(panel1);
		box2.add(panel2);

		JButton btnOK = new JButton("Ok");
		btnOK.setMaximumSize(new Dimension(80, 30));

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setMaximumSize(new Dimension(80, 30));
		JButton btnHelp = new JButton("Help");
		btnHelp.setMaximumSize(new Dimension(80, 30));

		Box box3 = Box.createVerticalBox();
		box3.setAlignmentX(Box.CENTER_ALIGNMENT);
		box3.add(Box.createVerticalGlue());
		box3.add(btnOK);
		box3.add(Box.createVerticalGlue());
		box3.add(btnCancel);
		box3.add(Box.createVerticalGlue());
		box3.add(btnHelp);
		box3.add(Box.createVerticalGlue());

//		add(box1, BorderLayout.WEST);
//		add(box2, BorderLayout.CENTER);
//		add(box3, BorderLayout.EAST);
		Box box = Box.createHorizontalBox();
		box.add(Box.createHorizontalGlue());
		box.add(box1);
		box.add(Box.createHorizontalGlue());
		box.add(box2);
		box.add(Box.createHorizontalGlue());
		box.add(box3);
		box.add(Box.createHorizontalGlue());
		add(box);
	}
}
