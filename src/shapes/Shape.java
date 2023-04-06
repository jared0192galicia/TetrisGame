package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import clases.BoardGame;
import controls.KeyControls;

public abstract class Shape {

	// size
	protected int WIDTH;
	protected int HEIGHT;
	protected int size = 20;

	protected int x = 0;
	protected int y = 0;

	// Aspect
	protected Color color;
	protected Color baseColor;

	// reason moving
	protected final int xd = 20;
	protected final int yd = 20;
	protected BoardGame board;

	// State
	private boolean status = true;
	protected int code;

	public Shape(int x, int y, BoardGame board) {
		this.x = x;
		this.y = y;
		this.board = board;
	}

	public abstract void moveShape(Rectangle limits);

	public void move(Rectangle limits) {
		if (getStatus()) {

			if (KeyControls.a && (x >= 20)) {
				x -= xd;
				System.out.println("press A");
			} else if (KeyControls.d && (x < limits.getMaxX() - WIDTH)) {
				x += xd;
				System.out.println("press D");
			} else

			// Limits the moving for the shape
			if (y < limits.getMaxY() - HEIGHT && !KeyControls.s && board.ifMoveElement(code, x, y, 0)) {
				board.moveElement(code, x, y, 0);
				y += yd;
				System.out.println("natural");
			} else if (KeyControls.s && (y < limits.getMaxY() - HEIGHT) && board.ifMoveElement(code, x, y, 0)) {
				board.moveElement(code, x, y, 0);
				y += yd;
				System.out.println("press S");
			} else {
				this.setStatus(false);
			}
		}
	}

	public abstract void draw(Graphics g, Color color, Color colorBase);

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
