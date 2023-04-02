package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class El extends Shape {
	
	public El(int x, int y) {
		super(x, y);
		HEIGHT = size * 3;
		WIDTH = size * 2;
	}
	
	@Override
	public void draw(Graphics g, Color color, Color colorBase) {
		g.setColor(color);
		
		g.fillRect(x, y, size, size);
		g.fillRect(x, y + size, size, size);
		g.fillRect(x, y + (size * 2), size, size);
		g.fillRect(x + size, y + (size * 2), size, size);
		
		g.setColor(colorBase);

		g.drawRect(x, y, size, size);
		g.drawRect(x, y + size, size, size);
		g.drawRect(x, y + (size * 2), size, size);
		g.drawRect(x + size, y + (size * 2), size, size);
	}

	@Override
	public void moveShape(Rectangle limits) {
		// TODO Auto-generated method stub
		
	}
}
