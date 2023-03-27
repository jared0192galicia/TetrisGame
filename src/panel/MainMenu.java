package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.GameWindow;
import clases.MenuWindow;

public class MainMenu extends JPanel implements ActionListener {
	
	private JLabel tittle;
	private JButton btnStart;
	private JButton btnScore;
	private JButton btnAccount;
	private JButton btnExit;
	MenuWindow window;
	
	public MainMenu(int width, int heigth, MenuWindow window) {
		initComponents();
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 40));
//		this.setLayout(new GridLayout(0,1,100,20));
		this.setAlignmentX(CENTER_ALIGNMENT);
		this.setSize(width, heigth);
		this.window = window;
//		this.setLayout(getLayout().);
	}
	
	public void initComponents() {
		
		Dimension maxSize = new Dimension();
		maxSize.setSize(250, 35);
		
		tittle = new JLabel("TETRIS");
		tittle.setSize(120, 30);
		tittle.setFont(new Font("Areal", Font.BOLD, 22));
		tittle.setForeground(new Color(30, 200, 100));
		tittle.setAlignmentX(CENTER_ALIGNMENT);
		tittle.setPreferredSize(maxSize);
		
		btnStart = new JButton("Jugar");
		btnStart.setPreferredSize(maxSize);
		btnStart.addActionListener(this);

		btnScore = new JButton("Score");
		btnScore.setPreferredSize(maxSize);
		btnScore.addActionListener(this);
		
		btnAccount = new JButton("cuenta");
		btnAccount.setPreferredSize(maxSize);
		btnAccount.addActionListener(this);
		
		btnExit = new JButton("Salir");
		btnExit.setPreferredSize(maxSize);
		btnExit.addActionListener(this);
		
		this.add(tittle);
		this.add(btnStart);
		this.add(btnScore);
		this.add(btnAccount);
		this.add(btnExit);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnStart) {
			window.dispose();
			new GameWindow();
		}
		
	}
}
