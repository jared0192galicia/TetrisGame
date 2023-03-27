package clases;

import javax.swing.JFrame;

import panel.MainMenu;

public class MenuWindow extends JFrame {
	
	private MainMenu panel;
	String name = MainWindow.name;
	public MenuWindow() {
		panel = new MainMenu(WIDTH, HEIGHT, this);
		this.setSize(600, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Bienvenido " + name);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
	}
}
