package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.GameWindow;
import shapes.Shape;

public class Game extends JPanel {

	Shape shape;
	
	private int width;
	private int heigth;
	
	ImageIcon imagen;
	ImageIcon figCuadro;
	

	int avanseX = 30;
	int avanseY = 0;

	public Game(GameWindow window) {
		setBackground(Color.blue);
		width = window.getWidth();
		heigth = window.getHeight();
		setSize(width, heigth);
		System.out.println("constructor");
		shape = new Shape(new Dimension(width, heigth), 20, Color.BLUE, Color.BLACK);
	}
	
	public void initComponents() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		shape.drawSquare(g, 20, 20);
		shape.drawBar(g, 100, 20, Color.gray, Color.CYAN);
		shape.drawEl(g, 140, 20, Color.CYAN, Color.GRAY);
		shape.drawZed(g, 170, 20, Color.BLACK, Color.WHITE);
		shape.drawTi(g, 220, 20, Color.magenta, Color.CYAN);
	}
}






