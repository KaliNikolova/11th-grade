package problem2;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.event.*;

import javax.swing.JPanel;

class BallPanel extends JPanel {
	private int delay = 10;
	ArrayList<Ball> list = new ArrayList<Ball>();
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public BallPanel() {
		timer.start();
	}

	public void add() {
		list.add(new Ball());
	}

	public void subtract() {
		if (list.size() > 0)
			list.remove(list.size() - 1); // Remove the last ball
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < list.size(); i++) {
			Ball ball = (Ball) list.get(i); // Get a ball
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				Ball ball1 = (Ball) list.get(i);
				Ball ball2 = (Ball) list.get(j);
				if(circle(ball1.x, ball1.y, ball1.radius, ball2.x, ball2.y, ball2.radius)>=0) {
					ball1.radius += ball2.radius;
					list.remove(j);
				}
			}
		}
	}

	static int circle(int x1, int y1, int x2, int y2, int r1, int r2) {
		int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		int radSumSq = (r1 + r2) * (r1 + r2);
		if (distSq == radSumSq)
			return 1;
		else if (distSq > radSumSq)
			return -1;
		else
			return 0;
	}

	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}