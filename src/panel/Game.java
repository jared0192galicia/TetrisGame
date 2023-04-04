package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.BoardGame;
import clases.GameWindow;
import shapes.Bar;
import shapes.El;
import shapes.Shape;
import shapes.Square;
import shapes.Ti;
import shapes.Zed;

public class Game extends JPanel {

	ArrayList<Shape> shape = new ArrayList<Shape>();
	public BoardGame board;
	
	// Objects auxi for array lists 
	El el;
	Ti ti;
	Zed zed;
	Bar bar;
	Square square;
	
	private int width;
	private int heigth;
	
	ImageIcon imagen;
	ImageIcon figCuadro;
	

	int avanseX = 30;
	int avanseY = 0;

	/**
	 * @category JPanel
	 * @param window is parent of Game
	 */
	public Game(GameWindow window) {
		this.width = window.getWidth();
		this.heigth = window.getHeight();
		setSize(width, heigth);
		this.setBackground(new Color(30, 30, 30));
		System.out.println("constructor");
		initComponents();
	}	
	
	public void initComponents() {
		// Init objects aux 
		board = new BoardGame(this, 25, 35);
		shape.add(board.generateShape());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(220, 220, 220, 150));

		// Create grid in the panel
		for (int i = 0; i < this.getWidth(); i+=20) {
			g.drawLine(i, 0, i, this.getHeight());
		}
		for (int i = 0; i < this.getHeight(); i+=20) {
			g.drawLine(0, i, this.getWidth(), i);
		}
		
		draw(g);
		update();
	}


	public void draw(Graphics g) {// Draw bar generic
		
		// Draw new shape if is needed
		if (!shape.get(shape.size() - 1).getStatus()) {
			shape.add(board.generateShape());
			//shape.get(shape.size() - 1).draw(g, Color.GRAY, Color.CYAN);
		}
		
		// Redraw the shapes in Shape
		for (Shape aux : shape) {
			aux.draw(g, Color.GRAY, Color.CYAN);
		}
//		System.out.println(shape.get(shape.size() - 1).get);
	}
	

	public void update() {
		shape.get(shape.size() - 1).move(getBounds());
	}
	
}






