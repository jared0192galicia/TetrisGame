package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import clases.BoardGame;

public class Ti extends Shape {
	
	public Ti(int x, int y, BoardGame board, Color border, Color fill) {
		super(x, y, board, border, fill);
		HEIGHT = size * 2;
		WIDTH = size * 3;
		code = 3;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(colorFill);

		g.fillRect(x, y, size, size);
		g.fillRect(x + size, y, size, size);
		g.fillRect(x + (size * 2), y, size, size);
		g.fillRect(x + size, y + size, size, size);
		
		g.setColor(colorBorder);

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
