package problem1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.event.*;

import javax.swing.JPanel;

class BallPanel extends JPanel {
	private int delay = 10;
	private PriorityQueue<Ball> list = new PriorityQueue<Ball>(new SortByRadius());
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class SortByRadius implements Comparator<Ball>{

		@Override
		public int compare(Ball o1, Ball o2) {
			// TODO Auto-generated method stub
			if(o1.radius > o2.radius) return -1;
			if(o1.radius < o2.radius) return 1;
			return 0;
		}
		
	}
	
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
		if (!list.isEmpty())
			list.poll();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball ball: list) {
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