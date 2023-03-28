package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Bar extends Shape {


	/**
	 * <h2>Draw bar in position x, y</h2>
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
}
