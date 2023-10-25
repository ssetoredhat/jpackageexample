package com.redhat.clientexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Hello world!
 *
 */
public class App extends JFrame implements ActionListener {
	public static void main(String args[]) {
		App frame = new App();
		frame.setVisible(true);
	}

	public App() {
		setTitle("MyTitle");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton btn = new JButton("Push");
		btn.setBounds(240, 0, 80, 30);
		btn.addActionListener(this);
		panel.add(btn);
		JTextArea t = new JTextArea();
		t.setBounds(0, 30, 600, 400);
		System.getProperties().forEach((s, v) -> t.append(s + ":" + v + "\n"));
		panel.add(t);
		getContentPane().add(panel, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent e) {
		JLabel label = new JLabel("Push A Button");
		JOptionPane.showMessageDialog(this, label);
	}
}