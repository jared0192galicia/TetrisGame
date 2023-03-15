package clases;

import javax.swing.JFrame;

public class MenuWindow extends JFrame {
	String name = "";
	public MenuWindow() {
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Bienvenido " + name);
		this.setVisible(true);
	}
}
