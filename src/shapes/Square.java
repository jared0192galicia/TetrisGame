package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Shape {
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

}
