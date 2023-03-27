package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Shape {
	private int WIDTH;
	private int HEIGHT;
	
	private Color color;
	private Color baseColor;
	private int size;
	
	/**
	 *@param size until
	 *@param base the squares base for shapes
	 * @param color for fill shapes
	 * @param baseColor Color for the line the shape 
	 */
	public Shape(Dimension size, int base, Color color, Color baseColor) {
		this.WIDTH = (int) size.getWidth();
		this.HEIGHT = (int) size.getHeight();
		this.color = color;
		this.size = base;
		this.baseColor = baseColor;
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
	
	public void drawSquare(Graphics g, int x, int y, Color color, Color colorBase) {
		this.baseColor = colorBase;
		this.color = color;
		
		drawSquare(g, x, y);
	}
	/**
	 * 
	 * @param g
	 * @param x
	 * @param y
	 */
	public void drawBar(Graphics g, int x, int y) {
		g.setColor(color);
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x, y + (size * 3), size, size);
		
		g.setColor(baseColor);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x, y + (size * 2), size, size);
		g.drawRect(x, y + (size * 3), size, size);
	}
	/**
	 * 
	 * @param g
	 * @param x
	 * @param y
	 * @param color
	 * @param colorBase
	 */
	public void drawBar(Graphics g, int x, int y, Color color, Color colorBase) {g.setColor(color);
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x, y + (size * 3), size, size);
		
		g.setColor(colorBase);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x, y + (size * 2), size, size);
		g.drawRect(x, y + (size * 3), size, size);
	}

	public void drawEl(Graphics g, int x, int y, Color color, Color colorBase) {
		g.setColor(color);
		
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x + size, y + (size * 2), size, size);
		
		g.setColor(colorBase);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x, y + (size * 2), size, size);
		g.drawRect(x + size, y + (size * 2), size, size);
	}
	
	public void drawZed(Graphics g, int x, int y, Color color, Color colorBase) {
		g.setColor(color);
		
		g.fillRect(x, y, size, size);
		g.fillRect(x + size, y, size, size);
		g.fillRect(x + size, y + size, size, size);
		g.fillRect(x + size, y + (size * 2), size, size);
		g.fillRect(x + (size * 2), y + (size * 2), size, size);
		
		g.setColor(colorBase);

		g.drawRect(x, y, size, size);
		g.drawRect(x + size, y, size, size);
		g.drawRect(x + size, y + size, size, size);
		g.drawRect(x + size, y + (size * 2), size, size);
		g.drawRect(x + (size * 2), y + (size * 2), size, size);
	}
	
	public void drawTi(Graphics g, int x, int y, Color color, Color colorBase) {
		g.setColor(color);

		g.fillRect(x, y, size, size);
		g.fillRect(x + size, y, size, size);
		g.fillRect(x + (size * 2), y, size, size);
		g.fillRect(x + size, y + size, size, size);
		
		g.setColor(colorBase);

		g.drawRect(x, y, size, size);
		g.drawRect(x + size, y, size, size);
		g.drawRect(x + (size * 2), y, size, size);
		g.drawRect(x + size, y + size, size, size);
	}
}









