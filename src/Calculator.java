import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	int num1;
	int num2;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JLabel result = new JLabel();

	int addition(int num1, int num2) {
		return num1 + num2;
	}

	int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	int division(int num1, int num2) {
		if(num2==0) {
			return 0;
		}
		return num1 / num2;
	}

	void GUI() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		panel.add(text1);
		text1.setPreferredSize(new Dimension(100, 30));
		panel.add(text2);
		text2.setPreferredSize(new Dimension(100, 30));
		panel.add(add);
		add.setText("add");
		add.addActionListener(this);
		panel.add(sub);
		sub.setText("subtract");
		sub.addActionListener(this);
		panel.add(mul);
		mul.setText("multiply");
		mul.addActionListener(this);
		panel.add(div);
		div.setText("divide");
		div.addActionListener(this);
		panel.add(result);
		result.setText("");
		result.setPreferredSize(new Dimension(100, 100));
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int sum = 0;
		String answer1 = text1.getText();
		int input1 = Integer.parseInt(answer1);
		String answer2 = text2.getText();
		int input2 = Integer.parseInt(answer2);
		if (e.getSource() == add) {
			sum = addition(input1, input2);
		}
		else if (e.getSource() == sub) {
			sum = subtraction(input1, input2);
		}
		else if (e.getSource() == mul) {
			sum = multiplication(input1, input2);
		}
		else {
			sum = division(input1, input2);
		}
		result.setText("" + sum);
		frame.pack();
	}

}
