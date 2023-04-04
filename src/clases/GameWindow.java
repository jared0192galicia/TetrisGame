package clases;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import controls.ControlThread;
import controls.KeyControls;
import panel.Game;

public class GameWindow extends JFrame {
	
	private Game game;
	protected static ControlThread thread;
	
	public GameWindow() {
		game = new Game(this);
		this.add(game);
		this.setTitle("Nueva partida");
		this.setSize(700 + 14, 500 +  37);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(new KeyControls(game));
		this.addWindowListener(new WindowAdapter(){
			  public void windowClosing(WindowEvent we){
				  
				  System.out.println("\n\n\n");
				  thread.iterate = false;
				  
				  
				  game.board.printBoard();
				  
				  System.exit(0);
				  }
				});
		
		thread = new ControlThread(game);
		thread.start();
	}
}




