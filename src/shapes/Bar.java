package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import controls.KeyControls;

public class Bar extends Shape {

	public Bar(int x, int y) {
		this.x = x;
		this.y = y;
		HEIGHT = size * 4;
		WIDTH = size;
	}

	/**
	 * <h2>Draw bar in position x, y</h2>
	 * 
	 * @param g
	 * @param x
	 * @param y
	 */
	public void drawBar(Graphics g, int x, int y) {
		this.x = x;
		this.y = y;
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
	public void drawBar(Graphics g, Color color, Color colorBase) {
		g.setColor(color);
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

	@Override
	/**
	 * <p> Update position
	 * @param limits limits of the panel 
	 */
	public void moveShape(Rectangle limits) {
		// TODO Auto-generated method stub
		// Compare if the shape is new
		if(getStatus()) {
			
			// Limits the moving for the Bar
			if (y < limits.getMaxY() - HEIGHT) {
				y += yd;
//				System.out.println("limit: " + limits.getMaxX() + " y = " + y);
			} else {
				this.setStatus(false);
			}
			// if press letter the control move shape
			if (KeyControls.s && (y < limits.getMaxY() - HEIGHT)) {
				y += yd;
			}
			if (KeyControls.a && (x >= 20)) {
				x -= xd;
			}
			if (KeyControls.d && (x < limits.getMaxX() - WIDTH)) {
				x += xd;
			}
		}
	}
}










