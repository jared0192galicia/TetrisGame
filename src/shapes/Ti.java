package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ti extends Shape {
	public void drawTi(Graphics g, int x, int y, Color color, Color colorBase) {
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
