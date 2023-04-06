package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import clases.BoardGame;
import controls.KeyControls;

public class Bar extends Shape {

	public Bar(int x, int y, BoardGame board, Color border, Color fill) {
		super(x, y, board, border, fill);
		HEIGHT = size * 4;
		WIDTH = size;
		code = 0;
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
		g.setColor(colorFill);
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x, y + (size * 3), size, size);

		g.setColor(colorBorder);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x, y + (size * 2), size, size);
		g.drawRect(x, y + (size * 3), size, size);
	}

	@Override
	/**
	 * 
	 * @param g
	 * @param x
	 * @param y
	 * @param color
	 * @param colorBase
	 */
	public void draw(Graphics g) {
		g.setColor(colorFill);
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x, y + (size * 3), size, size);

		g.setColor(colorBorder);

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










