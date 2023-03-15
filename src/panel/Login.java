package panel;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import clases.MenuWindow;

public class Login extends JPanel implements ActionListener {

	private int width;
	private int heigth;
	
	// Components for Panel
	private JPanel VBox;
	private JLabel image;
	private JLabel title;
	private JButton accses;
	private JTextField txtUser;
	private JPasswordField txtPass;
	
	public Login(int width, int heigth) {
		initComponents();
		this.width = width;
		this.heigth = heigth;
		this.setSize(this.width, heigth);
		this.setLayout(new GridLayout());
	}
	
	public void initComponents() {
		
		VBox = new JPanel();
//		VBox.setLayout(new FlowLayout());
		VBox.setLayout(null);
		VBox.setAlignmentX(CENTER_ALIGNMENT);
		
		image = new JLabel();
		image.setBounds(image.getX(), image.getY(), 400, 500);
		image.setPreferredSize(getMaximumSize());
		ImageIcon imagen = new ImageIcon("./src/images/wallpaperPrincipal.jpg");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(image.getWidth(),
                image.getHeight(), Image.SCALE_DEFAULT));
        image.setIcon(icono);
		// Add image to image
		
		accses = new JButton("Aceder");
		accses.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 22));
		accses.setAlignmentX(CENTER_ALIGNMENT);
		accses.addActionListener(this);
		accses.setBounds(150, 350, 150, 25);
		
		title = new JLabel("Login");
		title.setFont(new Font("Book Antiqua", Font.BOLD, 26));
		title.setBounds(180, 100, 210, 40);
		
		txtUser = new JTextField();
		txtUser.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		txtUser.setForeground(Color.WHITE);
		txtUser.setFont(new Font("Areal", Font.ITALIC, 16));
		txtUser.setSize(210, 25);
		txtUser.setBounds(80, 150, 210, 30);
		txtUser.setBackground(new Color(102,153,255));
		
		txtPass = new JPasswordField();
		txtPass.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		txtPass.setForeground(Color.WHITE);
		txtPass.setFont(new Font("Areal", Font.BOLD, 18));
		txtPass.setBounds(80, 220, 210, 30);
		txtPass.setBackground(new Color(102,153,255));

		VBox.add(title);
		VBox.add(txtUser);
		VBox.add(txtPass);
		VBox.add(accses);
		
		this.add(VBox);
		this.add(image);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == accses) {
//			JOptionPane.showMessageDialog(null, "Sin conexion");
			new MenuWindow();
			this.setVisible(false);
		}
	}
}








