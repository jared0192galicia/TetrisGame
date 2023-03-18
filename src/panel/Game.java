package panel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import clases.GameWindow;

public class Game extends JPanel {

	private int width;
	private int heigth;

	public Game(GameWindow window) {
		this.setBackground(Color.BLACK);
		this.width = window.getWidth();
		this.heigth = window.getHeight();
		this.setSize(width, heigth);
		System.out.println("constructor");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawLine(30, 0, 30, heigth);
	}
}
