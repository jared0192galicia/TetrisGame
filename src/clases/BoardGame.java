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
	private boolean cells[][];
	
	public BoardGame(Game game, int row, int colum) {
		this.game = game;
		cells = new boolean [row][colum];
		System.out.println(generatePosition());
	}
	
	/**
	 * 
	 * @return position random for x
	 */
	public int generatePosition() {
		return ((int) (Math.random() * cells.length)) * 20;
	}
	
	/**
	 * 
	 * @return Shape random in position (x, 0)
	 */
	public Shape generateShape() {
		int selection = (int) (Math.random() * 5);
		int position = generatePosition();
		Shape shape = null;
		addElemen(selection - 1, position, 0);
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
	
	/**
	 * 
	 * @param code of the shape <h3> 1 - 4 </h3>
	 * {@value 	1: Bar}
	 * {@value 	2: Square}
	 * {@value 	3: Ti}
	 * {@value 	4: Zed}
	 * {@value 	5: El}
	 * @param x corder of the shape
	 * @param y corder of the shape
	 */
	public void addElemen(int code, int x, int y) {
		
		// Valid argument code
		if ((code > 0) && (code < 6)) {
			
			int i = x / 20;
			int j = y / 20;
			
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			cells[i][j] = true;
			
			switch (code) {
			case 1:
				cells[i][j + 1] = true;
				cells[i][j + 2] = true;
				cells[i][j + 3] = true;
				break;
			case 2:
				cells[i][j + 1] = true;
				cells[i + 1][j] = true;
				cells[i + 2][j + 2] = true; 
				break;
			case 3: 
				cells[i + 1][j] = true;
				cells[i + 2][j] = true;
				cells[i + 1][j + 1] = true;
				break;
			case 4: 
				cells[i + 1][j] = true;
				cells[i + 1][j + 1] = true;
				cells[i + 2][j + 1] = true;
				break;
			case 5: 
				cells[i][j + 1] = true;
				cells[i][j + 2] = true;
				cells[i + 1][j + 2] = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + code);
			}
			
			for (int i2 = 0; i2 < cells.length; i2++) {
				for (int k = 0; k < cells[0].length; k++) {
					System.out.print("[" + cells[i2][k] + "] ");
				}
				System.out.println();
			}
		} else {
			throw new IllegalArgumentException("Unexpected value: " + code);
		}
	}
	
}










