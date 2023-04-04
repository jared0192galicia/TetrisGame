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
	
	protected int x = 20;
	protected int y = 20;

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
		if(getStatus()) {
			
			// Limits the moving for the shape
			if (y < limits.getMaxY() - HEIGHT) {
				board.moveElement(code, x, y, 0);
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
	
	public abstract void draw(Graphics g, Color color, Color colorBase);
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

}









