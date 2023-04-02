package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ti extends Shape {
	
	public Ti(int x, int y) {
		super(x, y);
		HEIGHT = size * 2;
		WIDTH = size * 3;
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
