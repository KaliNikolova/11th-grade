package problem1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class SpiralJPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xPoints[] = {20, 15, 0 , -15, -25, -15,   0,  27, 40, 27,  0, -30, -46, -30,   0,  42, 60, 42, 0};
		int yPoints[] = {0 , 15, 20,  15,   0, -23, -32, -23,  0, 30, 40,  30,   0, -40, -56, -40,  0, 44, 65};
		
		g.translate(150, 150);
		
		g.drawPolyline(xPoints, yPoints, 19);
	}
}
