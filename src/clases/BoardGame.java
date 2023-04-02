package clases;

import java.awt.Dimension;
import java.awt.Rectangle;

import panel.Game;
import shapes.Bar;
import shapes.El;
import shapes.Shape;
import shapes.Square;
import shapes.Ti;
import shapes.Zed;

public class BoardGame {
	
	private Game game;
	int cells[][];
	
	public BoardGame(Game game, int row, int colum) {
		this.game = game;
		cells = new int [row][colum];
		System.out.println(generatePosition());
	}
	
	public int generatePosition() {
		return ((int) (Math.random() * cells.length)) * 20;
	}
	
	
	public Shape generateShape() {
		int selection = (int) (Math.random() * 5);
		int position = generatePosition();
		Shape shape = null;
		
		switch (selection) {
		case 0: 
			shape = new Bar(position, 0);
			break;
			
			case 1: 
				shape = new El(position, 0);
				break;
				
			case 2: 
				shape = new Square(position, 0);
				break;
				
			case 3: 
				shape = new Ti(position, 0);
				break;
				
			case 4: 
				shape = new Zed(position, 0);
				break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
		return shape;
	}
}
