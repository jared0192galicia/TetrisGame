package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import clases.BoardGame;

public class Zed extends Shape{

	public Zed(int x, int y, BoardGame board, Color border, Color fill) {
		super(x, y, board, border, fill);
		WIDTH = size * 3;
		HEIGHT = size * 2;
		code = 4;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(colorFill);
		
		g.fillRect(x, y, size, size);
		g.fillRect(x + size, y, size, size);
//		g.fillRect(x + size, y + size, size, size);
		g.fillRect(x + size, y + (size * 1), size, size);
		g.fillRect(x + (size * 2), y + (size * 1), size, size);
		
		g.setColor(colorBorder);

		g.drawRect(x, y, size, size);
		g.drawRect(x + size, y, size, size);
//		g.drawRect(x + size, y + size, size, size);
		g.drawRect(x + size, y + (size * 1), size, size);
		g.drawRect(x + (size * 2), y + (size * 1), size, size);
	}

	@Override
	public void moveShape(Rectangle limits) {
		// TODO Auto-generated method stub
		
	}
	
}
