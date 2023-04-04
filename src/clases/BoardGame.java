package clases;

import panel.Game;
import shapes.Bar;
import shapes.El;
import shapes.Shape;
import shapes.Square;
import shapes.Ti;
import shapes.Zed;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class BoardGame {

	private Game game;
	private int cells[][];


	
	public BoardGame(Game game, int row, int colum) {
		this.game = game;
		cells = new int[row][colum];
		System.out.println(generatePosition());
		for (int i2 = 0; i2 < cells.length; i2++) {
			for (int k = 0; k < cells[0].length; k++) {
				cells[i2][k] = 0;
			}
		}
		playSountrack();
	}
	
	public void playSountrack() {
		Clip clip;
	    String ruta = "/media/Soundtrack.wav";
	    
	    try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource(ruta)));
            clip.loop(2);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            JOptionPane.showMessageDialog(null, "Error en audio:\n" + ex.getMessage());
        }
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
		addElemen(selection, position, 0);

		switch (selection) {
		case 0:
			shape = new Bar(position, 0, this);
			break;

		case 1:
			shape = new El(position, 0, this);
			break;

		case 2:
			shape = new Square(position, 0, this);
			break;

		case 3:
			shape = new Ti(position, 0, this);
			break;

		case 4:
			shape = new Zed(position, 0, this);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
		return shape;
	}

	/**
	 * 
	 * @param code of the shape
	 *             <h3>1 - 4</h3> {@value 0: Bar} {@value 1: EL} {@value 2: Square}
	 *             {@value 3: Ti} {@value 4: Zed}
	 * @param x    corder of the shape
	 * @param y    corder of the shape
	 */
	public void addElemen(int code, int x, int y) {

			int j = x / 20;
			int i = y / 20;

			System.out.println("i: " + i);
			System.out.println("j: " + j);
			cells[i][j] = 1;

			switch (code) {
			case 0:
				cells[i + 1][j] = 1;
				cells[i + 2][j] = 1;
				cells[i + 3][j] = 1;
				break;
			case 1:
				cells[i + 1][j] = 1;
				cells[i + 2][j] = 1;
				cells[i + 2][j + 1] = 1;
				break;
			case 2:
				cells[i + 1][j] = 1;
				cells[i][j + 1] = 1;
				cells[i + 1][j + 1] = 1;
				break;
			case 3:
				cells[i][j + 1] = 1;
				cells[i][j + 2] = 1;
				cells[i + 1][j + 1] = 1;
				break;
			case 4:
				cells[i][j + 1] = 1;
				cells[i + 1][j + 1] = 1;
				cells[i + 1][j + 2] = 1;
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
	}
	
	/**
	 * 
	 * @param code of the Shape {@value 0: Bar} {@value 1: EL} {@value 2: Square}
	 *             {@value 3: Ti} {@value 4: Zed}
	 * @param x current position in X
	 * @param y current position current in y
	 * @param direction of the moving
	 * {@value 0: down} {@value 1: left} {@value 2: right}
	 */
	public void moveElement(int code, int x, int y, int direction) {
		
		int j = x / 20;
		int i = y / 20;
		
		// Move shape selected
		switch (code) {
		case 0:
			if (direction == 0) {
				if (cells[i + 4][j] == 0 ) {
					cells[i][j] = 0;
					cells[i + 1][j] = 1;
					cells[i + 2][j] = 1;
					cells[i + 3][j] = 1;
					cells[i + 4][j] = 1;
				}
			}
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + code);
		}
	}

}















