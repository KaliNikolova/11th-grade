package problem2;

import javax.swing.*;


import java.awt.event.*;
import java.awt.*;

public class BallControl extends JPanel {
	private BallPanel ballPanel = new BallPanel();
	private JButton jbtSuspend = new JButton("Suspend");
	private JButton jbtResume = new JButton("Resume");
	private JButton jbtAdd = new JButton("+1");
	private JButton jbtSubtract = new JButton("-1");
	private JScrollBar jsbDelay = new JScrollBar();

	public BallControl() {
		// Group buttons in a panel
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		panel.add(jbtAdd);
		panel.add(jbtSubtract);
		// Add ball and buttons to the panel
		ballPanel.setBorder(new javax.swing.border.LineBorder(Color.red));
		jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
		ballPanel.setDelay(jsbDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jsbDelay, BorderLayout.NORTH);
		add(ballPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		// Register listeners
		addMouseListener(new MouseClickHandler());
		jbtSuspend.addActionListener(new Listener());
		jbtResume.addActionListener(new Listener());
		jbtAdd.addActionListener(new Listener());
		jbtSubtract.addActionListener(new Listener());
		jsbDelay.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				ballPanel.setDelay(jsbDelay.getMaximum() - e.getValue());
			}
		});
	}

	class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbtSuspend)
				ballPanel.suspend();
			else if (e.getSource() == jbtResume)
				ballPanel.resume();
			else if (e.getSource() == jbtAdd)
				ballPanel.add();
			else if (e.getSource() == jbtSubtract)
				ballPanel.subtract();
		}
	}

	private class MouseClickHandler extends MouseAdapter {
		// handle mouse-click event and determine which button was pressed
		public void mouseClicked( MouseEvent event )
		{
			int xPos = event.getX(); // get x-position of mouse
			int yPos = event.getY(); // get y-position of mouse

			for(int i=0;i<ballPanel.list.size();i++) {
				Ball ball = (Ball) ballPanel.list.get(i);
				int distSq = (ball.x - xPos) * (ball.x - xPos) + (ball.y - yPos) * (ball.y - yPos);
				if(distSq<= ball.radius*ball.radius) {
					ballPanel.list.remove(i);
				}
			}
		}
	}
}