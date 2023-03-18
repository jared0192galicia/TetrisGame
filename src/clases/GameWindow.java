package clases;

import javax.swing.JFrame;

import panel.Game;

public class GameWindow extends JFrame {
	
	Game game;
	
	public GameWindow() {
		game = new Game(this);
		this.setLocationRelativeTo(null);
		this.setSize(700, 500);
		this.setVisible(true);
		this.add(game);
	}
}
