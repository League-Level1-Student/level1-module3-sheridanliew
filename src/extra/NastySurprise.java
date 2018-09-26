package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();

	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		surprise.showButton();

	}

	void showButton() {
		frame.add(panel);
		frame.setVisible(true);
		trick.setText("trick");
		trick.addActionListener(this);
		treat.setText("treat");
		treat.addActionListener(this);
		panel.add(trick);
		panel.add(treat);
		frame.pack();
		frame.setTitle("Trick or treat!");
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (e.getSource() == trick) {
			showPictureFromTheInternet(
					"http://images.nationalgeographic.com/wpf/media-live/photos/000/347/custom/34708_1600x1200-wallpaper-cb1303241640.jpg");
		}
		if (e.getSource() == treat) {
			showPictureFromTheInternet(
					"https://images-na.ssl-images-amazon.com/images/I/817iyCn7ZzL._SX425_.jpg");
		}
		frame.pack();
	}

}
