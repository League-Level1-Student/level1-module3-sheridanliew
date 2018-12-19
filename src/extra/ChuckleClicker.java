package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JButton joke = new JButton();
	JButton punchline = new JButton();

	public static void main(String[] args) {
		ChuckleClicker chuckleClicker = new ChuckleClicker();
		chuckleClicker.makeButtons();
	}

	void makeButtons() {
		// JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Chuckle Clicker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(joke);
		joke.setText("joke");
		joke.addActionListener(this);
		panel.add(punchline);
		punchline.setText("punchline");
		punchline.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// JOptionPane.showMessageDialog(null, "hi");
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null,
					"What has four legs, is big, green, fuzzy, and if it fell out of a tree would kill you?");
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "A pool table.");
		}
	}
}
