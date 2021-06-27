package problem1;

import javax.swing.JFrame;

public class DrawingSpirals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame( "Drawing spirals" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	
		SpiralJPanel spiralJPanel = new SpiralJPanel();
		frame.add( spiralJPanel );
		frame.setSize( 315, 330 ); 
		frame.setVisible( true );
	}

}
