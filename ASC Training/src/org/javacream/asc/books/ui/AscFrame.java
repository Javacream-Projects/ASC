package org.javacream.asc.books.ui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class AscFrame extends JFrame {

	public AscFrame() throws HeadlessException {
	}

	public AscFrame(GraphicsConfiguration gc) {
		super(gc);
	}

	public AscFrame(String title) throws HeadlessException {
		super(title);
	}

	public AscFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

	{
		setBounds(10, 10, 100, 100);
	}
}
