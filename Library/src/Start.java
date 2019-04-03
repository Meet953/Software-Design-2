import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Start {


	public static int ind = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(new Color(240, 255, 255));
		frame.getContentPane().setForeground(new Color(192, 192, 192));
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setBounds(100, 100, 494, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInventoryManagementSystem = new JLabel("LIBRARY");
		lblInventoryManagementSystem.setBackground(Color.WHITE);
		lblInventoryManagementSystem.setForeground(Color.BLACK);
		lblInventoryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventoryManagementSystem.setFont(new Font("Sprocket BT", Font.BOLD, 20));
		lblInventoryManagementSystem.setBounds(52, 57, 364, 70);
		frame.getContentPane().add(lblInventoryManagementSystem);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 
				 MyFrame f = new MyFrame("");
				
			}
		});
		btnNewButton.setFont(new Font("Sprocket BT", Font.PLAIN, 18));
		btnNewButton.setBounds(177, 147, 105, 33);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
