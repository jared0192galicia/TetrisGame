package clases;

import javax.swing.JFrame;

import panel.Login;

public class MainWindow extends JFrame {

	private final int WIDTH = 800;
	private final int HEIGTH = 500;
	
	Login table;
	
	public  MainWindow() {
		table = new Login(WIDTH, HEIGTH);
		this.add(table);
		this.setVisible(true);
		this.setTitle("Tetriz");
		this.setResizable(false);
		this.setSize(WIDTH, HEIGTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
