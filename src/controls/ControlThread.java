package controls;

import panel.Game;

public class ControlThread extends Thread {
	
	public static boolean iterate = true;
	Game game;
	
	public ControlThread(Game game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		while(iterate) {
			try {
				sleep(900);
				game.repaint();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
