package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

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
	protected Color colorBorder;
	protected Color colorFill;

	// reason moving
	protected final int xd = 20;
	protected final int yd = 20;
	protected BoardGame board;

	// State
	private boolean status = true;
	protected int code;

	public Shape(int x, int y, BoardGame board, Color border, Color fill) {
		this.x = x;
		this.y = y;
		this.board = board;
		this.colorBorder = border;
		this.colorFill= fill;
	}

	public abstract void moveShape(Rectangle limits);

	public void move(Rectangle limits) {
		if (getStatus()) {

			if (KeyControls.a && (x >= 20) && board.ifMoveElement(code, x, y, 1)) {
				board.moveElement(code, x, y, 1);
				x -= xd;
//				System.out.println("press A");
				
			} else if (KeyControls.d && (x < limits.getMaxX() - WIDTH) && board.ifMoveElement(code, x, y, 2)) {
				board.moveElement(code, x, y, 2);
				x += xd;
//				System.out.println("press D");

			} else

			// Limits the moving for the shape
			if (y < limits.getMaxY() - HEIGHT && !KeyControls.s && board.ifMoveElement(code, x, y, 0)) {
				board.moveElement(code, x, y, 0);
				y += yd;
//				System.out.println("natural");
			
			} else if (KeyControls.s && (y < limits.getMaxY() - HEIGHT) && board.ifMoveElement(code, x, y, 0)) {
				board.moveElement(code, x, y, 0);
				y += yd;
//				System.out.println("press S");
			
			} else {
				this.setStatus(false);
			}
		} else {
			if (y <= 0) {
				JOptionPane.showMessageDialog(null, "mamaste");
			}
			System.out.println(y);
		}
	}

	public abstract void draw(Graphics g);
//	public abstract void maping(int x, int y);

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
