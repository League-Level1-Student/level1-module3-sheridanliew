package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker chuckleClicker = new ChuckleClicker();
		chuckleClicker.makeButtons();
	}

	void makeButtons() {
		// JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(250, 75);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton joke = new JButton();
		panel.add(joke);
		joke.setText("joke");
		joke.addActionListener(this);
		JButton punchline = new JButton();
		panel.add(punchline);
		punchline.setText("punchline");
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hi");
	}
}
