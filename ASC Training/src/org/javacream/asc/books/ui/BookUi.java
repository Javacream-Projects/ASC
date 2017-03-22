package org.javacream.asc.books.ui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BookUi implements ActionListener {

	public static void main(String[] args) {
		new BookUi();
	}

	private JTextField isbnInput;
	private JButton saveButton;
	private JButton clearButton;
	private JTextField titleInput;
	{
		JFrame frame = new JFrame("B O O K S");
		frame.setBounds(10, 10,  200, 400);
		JLabel isbnLabel = new JLabel("ISBN:");
		JLabel titleLabel = new JLabel("Title:");
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		isbnInput = new JTextField();
		titleInput = new JTextField();
		GridLayout layout = new GridLayout(3, 2);
		//FlowLayout layout = new FlowLayout();
		Container content = frame.getContentPane();
		content.setLayout(layout);
		content.add(isbnLabel);
		content.add(isbnInput);
		content.add(titleLabel);
		content.add(titleInput);
		content.add(saveButton);
		content.add(clearButton);
		saveButton.addActionListener(this);
		clearButton.addActionListener(new ClearActionListener());
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveButton) {
			System.out.println(this.isbnInput.getText());
			System.out.println(this.titleInput.getText());
		}else if (e.getSource() == clearButton){
			this.isbnInput.setText("");
			this.titleInput.setText("");
		}
	}
	
	class ClearActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clearlistener");
			BookUi.this.isbnInput.setText("");
			BookUi.this.titleInput.setText("");
		}
		
	}
}
