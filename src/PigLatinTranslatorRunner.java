import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JButton button = new JButton();
	JLabel translated = new JLabel();

	public static void main(String[] args) {
		new PigLatinTranslatorRunner().GUI();
	}

	void GUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(text);
		text.setPreferredSize(new Dimension(200, 20));
		panel.add(button);
		button.setText("translate  -->");
		button.addMouseListener(this);
		panel.add(translated);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		PigLatinTranslator plt = new PigLatinTranslator();
		if (e.getSource() == button) {
			//plt.translate();
			//getText
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
