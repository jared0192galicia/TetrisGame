package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import clases.BoardGame;

public class Ti extends Shape {
	
	public Ti(int x, int y, BoardGame board) {
		super(x, y, board);
		HEIGHT = size * 2;
		WIDTH = size * 3;
		code = 3;
	}
	
	public void draw(Graphics g, Color color, Color colorBase) {
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

	@Override
	public void moveShape(Rectangle limits) {
		// TODO Auto-generated method stub
		
	}
}
