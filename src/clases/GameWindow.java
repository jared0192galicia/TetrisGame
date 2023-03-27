package clases;

import javax.swing.JFrame;

import panel.Game;

public class GameWindow extends JFrame {
	
	private Game game;
	
	public GameWindow() {
		this.setTitle("Nueva partida");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		game = new Game(this);
		this.add(game);
	}
}
