
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	private int index=0;

	private LinkedList list=new LinkedList();
	private final JButton btnAddBooks = new JButton("ADD BOOKS");
	private final JButton btnDeleteBooks = new JButton("DELETE BOOKS");
	private final JButton btnListBooks = new JButton("LIST BOOKS");
	private final JLabel lblLibrary = new JLabel("LIBRARY");
	private final JButton btnSearchBooks = new JButton("ISSUE BOOKS");
	private final JButton btnReturnBooks = new JButton("RETURN BOOKS");

	public MyFrame(String s){
		super(s);
		//init_Flight_list();
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		getContentPane().setLayout(null);
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddBook window = new AddBook(list);
				window.frame.setVisible(true);
			}
		});
		btnAddBooks.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnAddBooks.setBounds(120, 95, 142, 29);
		
		getContentPane().add(btnAddBooks);
		btnDeleteBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 	list.delete_first();
			}
		});
		btnDeleteBooks.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnDeleteBooks.setBounds(42, 150, 132, 29);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 272, 350, 111);
		getContentPane().add(textArea);
		setSize(420,433);    setVisible(true);
		
		getContentPane().add(btnDeleteBooks);
		btnListBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				list.printlist();
				String res = list.getDetails();
				textArea.setText(res);
			}
		});
		btnListBooks.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnListBooks.setBounds(42, 211, 125, 29);
		
		getContentPane().add(btnListBooks);
		lblLibrary.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		lblLibrary.setBounds(151, 36, 84, 29);
		
		getContentPane().add(lblLibrary);
		btnSearchBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				SearchBook window = new SearchBook(list);
				window.frame.setVisible(true);
			}
			
		});
		btnSearchBooks.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnSearchBooks.setBounds(231, 150, 132, 29);
		
		getContentPane().add(btnSearchBooks);
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddBook window = new AddBook(list);
				window.frame.setVisible(true);
			}
		});
		btnReturnBooks.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnReturnBooks.setBounds(231, 211, 132, 29);
		
		getContentPane().add(btnReturnBooks);
		
		
		
	}

	public void actionPerformed(ActionEvent e)
	{
		 Object target=e.getSource();
	}
}