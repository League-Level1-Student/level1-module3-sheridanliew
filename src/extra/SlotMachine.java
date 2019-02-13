package extra;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton spinner;
	JLabel reel1;
	JLabel reel2;
	JLabel reel3;
	Random random = new Random();
	String orange = "th-4.jpg";
	String lime = "th-1.jpg";
	String lemon = "th-2.jpg";
	int random1;
	int random2;
	int random3;

	public static void main(String[] args) {
		new SlotMachine().window();
	}

	void window() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Slot Machine");
		panel = new JPanel();
		frame.add(panel);
		reel1 = getRandomPicture(1);
		panel.add(reel1);
		reel2 = getRandomPicture(2);
		panel.add(reel2);
		reel3 = getRandomPicture(3);
		panel.add(reel3);
		spinner = new JButton();
		panel.add(spinner);
		spinner.setText("SPIN");
		spinner.addMouseListener(this);
		panel.setLayout(new GridLayout());
		frame.pack();
	}

	JLabel getRandomPicture(int rand) {
		int r = random.nextInt(3);
		if (rand == 1) {
			random1 = r;
		} else if (rand == 2) {
			random2 = r;
		} else {
			random3 = r;
		}
		try {
			if (r == 0) {
				return createLabelImage(orange);
			} else if (r == 1) {
				return createLabelImage(lime);
			} else {
				return createLabelImage(lemon);
			}
		} catch (Exception ex) {
			return new JLabel();
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		window();
		if (random1 == random2 && random2 == random3) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!");
		}
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
