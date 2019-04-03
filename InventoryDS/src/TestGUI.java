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

public class TestGUI {

	private JFrame frame;
	private JTextField textItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sprocket BT", Font.BOLD, 20));
		lblNewLabel.setBounds(103, 11, 255, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblInventoryManagementSystem = new JLabel(" INVENTORY MANAGEMENT SYSTEM");
		lblInventoryManagementSystem.setForeground(new Color(0, 0, 128));
		lblInventoryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventoryManagementSystem.setFont(new Font("Sprocket BT", Font.BOLD, 20));
		lblInventoryManagementSystem.setBounds(52, 57, 364, 70);
		frame.getContentPane().add(lblInventoryManagementSystem);
		
		textItem = new JTextField();
		textItem.setBounds(175, 163, 127, 20);
		frame.getContentPane().add(textItem);
		textItem.setColumns(10);
		
		JButton btnBST = new JButton("BST");
		btnBST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String item = textItem.getText();
				if(item.length() > 0) {
					Global.item = item.toUpperCase();	
				}
				else {
					Global.item = "ITEM";
				}
				BSTInven window = BSTInven.getInstance();
				window.frame.setVisible(true);
				 
			}
		});
		btnBST.setFont(new Font("Sprocket BT", Font.PLAIN, 18));
		btnBST.setBounds(92, 218, 105, 33);
		frame.getContentPane().add(btnBST);
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to manage?");
		lblNewLabel_1.setFont(new Font("Sprocket BT", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(145, 138, 213, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnHashtable = new JButton("HashTable");
		btnHashtable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String item = textItem.getText();
				if(item.length() > 0) {
					Global.item = item.toUpperCase();	
				}
				else {
					Global.item = "ITEM";
				}
				HashTableInven window =  HashTableInven.getInstance();
				window.frame.setVisible(true);
				 
				
			}
		});
		btnHashtable.setFont(new Font("Sprocket BT", Font.PLAIN, 18));
		btnHashtable.setBounds(253, 218, 127, 33);
		frame.getContentPane().add(btnHashtable);
		
		
	}
}
