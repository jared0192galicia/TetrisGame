package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

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
	
	// State
	public boolean status = true;

	public abstract void moveShape(Rectangle limits);
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

}









