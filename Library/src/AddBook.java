
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AddBook{
	
	
	
	JFrame frame;
	private JLabel l0 = new JLabel("Library");
	private JPanel p1= new JPanel();
	int index;

	private LinkedList list=new LinkedList();
	private JTextField tID;
	private JTextField tName;
	private JTextField tAuthor;
	private JTextField tDur;
	private JTextField tNote;

	public AddBook(LinkedList list2) {
		list = list2;
		
		initialize();
	}
	
 

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 687, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setBounds(280, 18, 0, 0);
		p1.setLayout(new GridLayout(6,2));
		frame.getContentPane().setLayout(null);
		l0.setBounds(144, 11, 173, 27);
		l0.setFont(f);  
		frame.getContentPane().add(l0);

		frame.getContentPane().add(p1);
		
		tID = new JTextField();
		tID.setEditable(false);
		tID.setBounds(194, 60, 38, 20);
		frame.getContentPane().add(tID);
		tID.setColumns(10);
		
		tName = new JTextField();
		tName.setBounds(194, 91, 86, 20);
		frame.getContentPane().add(tName);
		tName.setColumns(10);
		
		tAuthor = new JTextField();
		tAuthor.setBounds(194, 122, 86, 20);
		frame.getContentPane().add(tAuthor);
		tAuthor.setColumns(10);
		
		tDur = new JTextField();
		tDur.setBounds(194, 161, 65, 20);
		frame.getContentPane().add(tDur);
		tDur.setColumns(10);
		
		tNote = new JTextField();
		tNote.setBounds(194, 192, 149, 34);
		frame.getContentPane().add(tNote);
		tNote.setColumns(10);
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int id = list.count() + 1;
				int t = Integer.parseInt(tDur.getText());
				String na = tName.getText();
				String at = tAuthor.getText();
				String no = tNote.getText();
				
				list.insert(id, na, at, t, no);
				
				tName.setText("");tAuthor.setText("");
				tNote.setText(""); tDur.setText("");
				
			}
		});
		btnNewButton.setBounds(156, 251, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(77, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setBounds(77, 94, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(77, 125, 46, 14);
		frame.getContentPane().add(lblAuthor);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(77, 164, 80, 14);
		frame.getContentPane().add(lblDuration);
		
		JLabel lblNotes = new JLabel("Rules");
		lblNotes.setBounds(77, 195, 46, 14);
		frame.getContentPane().add(lblNotes);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(349, 251, 65, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setSize(440,324);    frame.setVisible(true);}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	 
	
	 
}