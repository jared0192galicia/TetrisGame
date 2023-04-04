package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import clases.BoardGame;

public class Square extends Shape {
	
	public Square(int x, int y, BoardGame board) {
		super(x, y, board);
		HEIGHT = size * 2;
		WIDTH = size * 2;
		code = 2;
	}

	/**
	 * @param g Object for draw
	 * @param x position in x
	 * @param y position in y
	 * */
	public void drawSquare(Graphics g, int x, int y) {
		g.setColor(color);
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x + size, y, size, size);
		g.fillRect(x + size, y + size, size, size);
		
		g.setColor(baseColor);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x + size, y, size, size);
		g.drawRect(x + size, y + size, size, size);
		
	}
	
	@Override
	public void draw(Graphics g, Color color, Color colorBase) {
		this.baseColor = colorBase;
		this.color = color;
		
		drawSquare(g, x, y);
	}

	@Override
	public void moveShape(Rectangle limits) {
		// TODO Auto-generated method stub
		
	}

}
