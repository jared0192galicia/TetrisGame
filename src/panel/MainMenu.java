package panel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.GameWindow;

public class MainMenu extends JPanel implements ActionListener {
	
	private JLabel title;
	private JButton btnStart;
	
	public MainMenu(int width, int heigth) {
		initComponents();
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 25));
		this.setSize(width, heigth);
//		this.setLayout(getLayout().);
	}
	
	public void initComponents() {
		title = new JLabel("TETRIS");
		title.setSize(120, 30);
		
		btnStart = new JButton("webos");
		title.setSize(120, 30);
		btnStart.addActionListener(this);
		
		this.add(title);
		this.add(btnStart);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnStart) {
			new GameWindow();
		}
		
	}
}
