package controls;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import panel.Game;


public class KeyControls extends KeyAdapter {

	public static boolean a;
	public static boolean d;
	public static boolean s;
	public static boolean left;
	public static boolean right;
	
	private boolean keyValid;
	private int code;
	Game game;
	
	public KeyControls(Game game) {
		this.game = game;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		code = e.getKeyCode();
		keyValid = true;
		
		switch (code) {
		case KeyEvent.VK_A:
			a = true;
			break;
			
		case KeyEvent.VK_D:
			d = true;
			break;
			
		case KeyEvent.VK_S:
			s = true;
			break;
			
		case KeyEvent.VK_LEFT:
			left = true;
			break;
			
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
			
		case KeyEvent.VK_ESCAPE:
			ControlThread.iterate = !ControlThread.iterate;
			break;
			
		default:
//			throw new IllegalArgumentException("Unexpected value: " + eve);
			System.err.println("No iniciado");
			keyValid = false;
		}
		if (keyValid) {
			game.repaint();
		}		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		code = e.getKeyCode();
		
		switch (code) {
		case KeyEvent.VK_A:
			a = false;
			break;
			
		case KeyEvent.VK_D:
			d = false;
			break;
			
		case KeyEvent.VK_S:
			s = false;
			break;
			
		case KeyEvent.VK_LEFT:
			left = false;
			break;
			
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
			
		default:
//			throw new IllegalArgumentException("Unexpected value: " + eve);
			System.err.println("No iniciado");
		}
	}
}
