package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class El extends Shape {
	public void drawEl(Graphics g, int x, int y, Color color, Color colorBase) {
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
}
