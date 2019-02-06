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
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton spinner;
	JLabel orangeLabel;
	JLabel limeLabel;
	JLabel lemonLabel;
	Random random = new Random();
	String orange = "th-4.jpg";
	String lime = ("th-1.jpg");
	String lemon = ("th-2.jpg");

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
		panel.add(getRandomPicture());
		panel.add(getRandomPicture());
		panel.add(getRandomPicture());
		spinner = new JButton();
		panel.add(spinner);
		spinner.setText("SPIN");
		spinner.addMouseListener(this);
		panel.setLayout(new GridLayout());
		frame.pack();
	}

	JLabel getRandomPicture() {
		int r = random.nextInt(3);
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
		if (e.getSource() == spinner) {
			frame.dispose();
			window();
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
