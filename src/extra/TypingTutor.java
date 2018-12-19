package extra;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {

	char currentLetter;
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	boolean getLetter = false;

	public static void main(String[] args) {
		TypingTutor typingTutor = new TypingTutor();
		typingTutor.frame();
	}

	void frame() {
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(260.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		frame.addKeyListener(this);
		frame.pack();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		if (!getLetter) {
			if (e.getKeyChar() == currentLetter) {
				System.out.println("Correct!");
				frame.setBackground(Color.GREEN);
			} else {
				System.out.println("Incorrect...");
				frame.setBackground(Color.RED);
			}
			frame.repaint();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!getLetter) {
			getLetter = true;
		} else {
			currentLetter = generateRandomLetter();
			label.setText(String.valueOf(currentLetter));
			frame.pack();
		}
	}
}
