package clases;

import java.awt.Dimension;
import java.awt.Rectangle;

import panel.Game;

public class BoardGame {
	
	private Game game;
	int cells[][];
	
	public BoardGame(Game game, int row, int colum) {
		this.game = game;
		System.out.println(game.getWidth() + " y: " + game.getHeight()/20);
		cells = new int [row][colum];
	}
	
	
}
