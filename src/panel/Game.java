package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.GameWindow;
import shapes.Bar;
import shapes.El;
import shapes.Shape;
import shapes.Square;
import shapes.Ti;
import shapes.Zed;

public class Game extends JPanel {

	// Create arrays for the shapes
	ArrayList<Zed> zeds = new ArrayList<Zed>();
	ArrayList<Bar> bars = new ArrayList<Bar>();
	ArrayList<El> els = new ArrayList<El>();
	ArrayList<Square> squares = new ArrayList<Square>();
	ArrayList<Ti> tis = new ArrayList<Ti>();

	// Objects auxi for array lists 
	El el;
	Ti ti;
	Zed zed;
	Bar bar;
	Square square;
	
	private int width;
	private int heigth;
	
	ImageIcon imagen;
	ImageIcon figCuadro;
	

	int avanseX = 30;
	int avanseY = 0;

	public Game(GameWindow window) {
		setBackground(Color.blue);
		width = window.getWidth();
		heigth = window.getHeight();
		setSize(width, heigth);
		System.out.println("constructor");
		
		el = new El();
		ti = new Ti();
		zed = new Zed();
		bar = new Bar();
		square = new Square();
	}
	
	public void initComponents() {
	}
	
	@Override
	public void paintComponent(Graphics g) {
		

		for (int i = 0; i < this.getWidth(); i+=20) {
			g.drawLine(i, 0, i, this.getHeight());
		}
		for (int i = 0; i < this.getHeight(); i+=20) {
			g.drawLine(0, i, this.getWidth(), i);
		}
		
		g.setColor(Color.WHITE);
		square.drawSquare(g, 20, 20);
		bar.drawBar(g, 100, 20, Color.gray, Color.CYAN);
		el.drawEl(g, 140, 20, Color.CYAN, Color.GRAY);
		ti.drawTi(g, 220, 20, Color.magenta, Color.CYAN);
	}
}






