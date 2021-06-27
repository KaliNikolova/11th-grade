package problem1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.lang.Object;
import java.text.DecimalFormat;

public class ProductForm extends JFrame {

	JLabel lblDescription = new JLabel("Description:");
	JLabel lblPrice = new JLabel("Price:");
	JTextField txtDescription = new JTextField("");
	JTextField txtPrice = new JTextField("");
	JButton btnAddToList = new JButton("Add to List");
	JButton btnShowProducts = new JButton("Show Products");
	JButton btnSortProducts = new JButton("Sort Products");
	JButton btnAveragePrice = new JButton("Average Price");
	JPanel panel1;
	JTextArea txtShow = new JTextArea("");
	ListOfProducts products = new ListOfProducts();

	public ProductForm() {

		SpringLayout layout = new SpringLayout();
		panel1 = new JPanel(layout);
		txtDescription.setPreferredSize(new Dimension(150, 25));
		txtPrice.setPreferredSize(new Dimension(150, 25));
		btnShowProducts.setMaximumSize(new Dimension(130, 25));
		btnSortProducts.setMaximumSize(new Dimension(130, 25));
		btnAveragePrice.setMaximumSize(new Dimension(130, 25));
		panel1.add(lblDescription);
		panel1.add(txtDescription);
		panel1.add(lblPrice);
		panel1.add(txtPrice);
		panel1.add(btnAddToList);
		panel1.setMaximumSize(new Dimension(250, 160));
		panel1.setPreferredSize(new Dimension(250, 150));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		layout.putConstraint(SpringLayout.WEST, lblDescription, 5, SpringLayout.WEST, panel1);
		layout.putConstraint(SpringLayout.WEST, lblPrice, 5, SpringLayout.WEST, panel1);
		layout.putConstraint(SpringLayout.NORTH, txtDescription, 15, SpringLayout.NORTH, panel1);
		layout.putConstraint(SpringLayout.NORTH, lblDescription, 20, SpringLayout.NORTH, panel1);
		layout.putConstraint(SpringLayout.WEST, txtDescription, 5, SpringLayout.EAST, lblDescription);
		layout.putConstraint(SpringLayout.NORTH, lblPrice, 10, SpringLayout.SOUTH, txtDescription);
		layout.putConstraint(SpringLayout.WEST, txtPrice, 40, SpringLayout.EAST, lblPrice);
		layout.putConstraint(SpringLayout.NORTH, txtPrice, 5, SpringLayout.SOUTH, txtDescription);
		layout.putConstraint(SpringLayout.NORTH, btnAddToList, 5, SpringLayout.SOUTH, txtPrice);
		layout.putConstraint(SpringLayout.WEST, btnAddToList, 90, SpringLayout.WEST, panel1);
		Box box1 = Box.createHorizontalBox();
		box1.add(panel1);
		Box box2 = Box.createVerticalBox();
		box2.add(Box.createVerticalGlue());
		box2.add(btnSortProducts);
		box2.add(btnShowProducts);
		box2.add(btnAveragePrice);
		box2.add(Box.createVerticalGlue());
		box1.add(Box.createHorizontalGlue());
		box1.add(box2);
		box1.add(Box.createHorizontalGlue());
		add(box1, BorderLayout.NORTH);
		txtShow.setPreferredSize(new Dimension(100, 100));
		add(txtShow, BorderLayout.SOUTH);
		
		btnAddToList.addActionListener(new ListenToAdd());
		btnSortProducts.addActionListener(new ListenToSort());
		btnShowProducts.addActionListener(new ListenToShow());
		btnAveragePrice.addActionListener(new ListenToAvPrice());
	}
	
	class ListenToAdd implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			products.add(new Product(txtDescription.getText(),products.getSize(), Double.parseDouble( txtPrice.getText())));
			txtDescription.setText("");
			txtPrice.setText("");
		}
		
	}
	class ListenToSort implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			products.sortByPrice();
			if(products.toString()==null) return;
			txtShow.setText(products.toString());
		}
		
	}
	class ListenToShow implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(products.toString()==null) return;
			txtShow.setText(products.toString());
		}
		
	}
	class ListenToAvPrice implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			DecimalFormat df = new DecimalFormat("####0.00");
			txtShow.setText("Average Price: "+df.format(products.averagePrice()));
		}
		
	}

	public static void main(String[] args) {
		ProductForm frame = new ProductForm();
		frame.setVisible(true);
		frame.setSize(new Dimension(450, 400));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
