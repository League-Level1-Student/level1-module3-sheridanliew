package extra;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	static Random r = new Random();
	int molesMissed;
	int molesWhacked;
	static Date time;

	public static void main(String[] args) {
		time = new Date();
		new WhackAMole().drawButtons(r.nextInt(24));
	}

	void drawButtons(int random) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack-a-Mole");
		frame.setSize(275, 300);
		panel = new JPanel();
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			button = new JButton();
			if (random == i) {
				button.setText("mole!");
			}
			panel.add(button);
			button.addMouseListener(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton mole = (JButton) e.getSource();
		String text = mole.getText();
		if (text != "mole!") {
			molesMissed++;
			speak("You missed.");
		} else {
			molesWhacked++;
		}
		if (molesWhacked==10) {
			endGame(time, molesWhacked);
		}
		drawButtons(r.nextInt(24));
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
