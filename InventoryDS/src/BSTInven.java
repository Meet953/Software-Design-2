import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class BSTInven {

	JFrame frame;
	private JTextField txtName;
	private JTextField txtType;
	private JTextField txtPrice;
	private JTextField txtItemID;


	 
	BinaryTree tree   = new BinaryTree();
	
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JTextField txtSearchID;
	private JTextField txtID;
	
	private static BSTInven single;
	private static boolean created=  false;
	private JTextField txtNameOccur;
	
	private BSTInven()
	{
		single = this;
		created = true;
		initialize();
	}
	
	public static BSTInven getInstance() {
		// TODO Auto-generated method stub
		if(!created) {
			single=new BSTInven();
		}
		return single;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BSTInven window = new BSTInven();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 687, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(240, 248, 255));
		tabbedPane.setBounds(10, 0, 651, 474);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Addpanel = new JPanel();
		Addpanel.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("ADD " + Global.item, null, Addpanel, null);
		tabbedPane.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		Addpanel.setLayout(null);
		
		JLabel lblInventory = new JLabel("INVENTORY ");
		lblInventory.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		lblInventory.setBounds(225, 48, 149, 23);
		Addpanel.add(lblInventory);
		
		
		JLabel label_1 = new JLabel("Item Name");
		label_1.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		label_1.setBounds(190, 164, 87, 23);
		Addpanel.add(label_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(310, 167, 109, 20);
		Addpanel.add(txtName);
		
		JLabel label_2 = new JLabel("Item Type");
		label_2.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		label_2.setBounds(190, 208, 87, 23);
		Addpanel.add(label_2);
		
		txtType = new JTextField();
		txtType.setColumns(10);
		txtType.setBounds(310, 211, 109, 20);
		Addpanel.add(txtType);
		
		JLabel label_3 = new JLabel("Item Price");
		label_3.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		label_3.setBounds(190, 251, 87, 23);
		Addpanel.add(label_3);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(310, 254, 109, 20);
		Addpanel.add(txtPrice);
		
		JLabel lblAddResult = new JLabel("");
		lblAddResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddResult.setForeground(Color.BLUE);
		lblAddResult.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblAddResult.setBounds(221, 343, 176, 23);
		Addpanel.add(lblAddResult);
		
		JButton btnAddfirst = new JButton("ADD ");
		btnAddfirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.parseInt(txtID.getText());
				 String name=txtName.getText();
                 String type=txtType.getText();
                 String price=txtPrice.getText();
                 
                 if(i>0 && name.length() > 0 && type.length() > 0 && price.length() > 0) {
                	 int id = i;
                	 int indexOf=price.indexOf(".");
                	 String euro=price.substring(0,indexOf);
 	 		         String cents=price.substring(indexOf+1);
 	 		         int eu=Integer.parseInt(euro);
 	 		         int ce=Integer.parseInt(cents); 
 	 		         Item it = new Item(name, type, eu, ce);
 	 		   
 	 		         tree.add(id, it);
 	 		          
 	 		         lblAddResult.setForeground(Color.GREEN);
 	 		         lblAddResult.setText("SUCCESS");
 	 		         
 	 		         txtID.setText("");
 	 		         txtName.setText("");
 	                 txtType.setText("");
 	                 txtPrice.setText("");
                 }
			}
		});
		btnAddfirst.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnAddfirst.setBounds(234, 309, 109, 23);
		Addpanel.add(btnAddfirst);
		
		JLabel lblItemId = new JLabel("Item ID");
		lblItemId.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblItemId.setBounds(190, 114, 87, 23);
		Addpanel.add(lblItemId);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(310, 117, 109, 20);
		Addpanel.add(txtID);
		
		JLabel lblBst = new JLabel("BST");
		lblBst.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		lblBst.setBounds(10, 11, 109, 23);
		Addpanel.add(lblBst);
		
			
			JPanel Searchpanel = new JPanel();
			Searchpanel.setBackground(new Color(240, 255, 255));
			tabbedPane.addTab("SEARCH " + Global.item, null, Searchpanel, null);
			Searchpanel.setLayout(null);
			
			JLabel lblItemId_2 = new JLabel("Item ID");
			lblItemId_2.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			lblItemId_2.setBounds(159, 122, 87, 23);
			Searchpanel.add(lblItemId_2);
			
			txtSearchID = new JTextField();
			txtSearchID.setColumns(10);
			txtSearchID.setBounds(315, 125, 109, 20);
			Searchpanel.add(txtSearchID);
			
			JTextArea txtNameArea = new JTextArea();
			txtNameArea.setEditable(false);
			txtNameArea.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			txtNameArea.setBounds(188, 258, 236, 83);
			Searchpanel.add(txtNameArea);
			
			
			JButton btnSearch = new JButton("SEARCH");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					int id  = Integer.parseInt(txtSearchID.getText());
					
					if(id > 0) {
						Node result = tree.search(id);
						txtNameArea.setVisible(true);
						txtNameArea.setText(result.item.toString());
						txtNameArea.append(System.getProperty("line.separator"));
						txtNameArea.append("Step Count : "  + tree.getCount() );
					}
				}
			});
			
			btnSearch.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			btnSearch.setBounds(228, 187, 109, 23);
			Searchpanel.add(btnSearch);
			
			JLabel label_7 = new JLabel("INVENTORY");
			label_7.setFont(new Font("Sprocket BT", Font.BOLD, 18));
			label_7.setBounds(215, 33, 161, 23);
			Searchpanel.add(label_7);
			
			JLabel label_6 = new JLabel("BST");
			label_6.setFont(new Font("Sprocket BT", Font.BOLD, 18));
			label_6.setBounds(10, 11, 109, 23);
			Searchpanel.add(label_6);
			
		
			
			
			
			
			txtNameArea.setVisible(false);
		
		
		
		JPanel Deletepanel = new JPanel();
		Deletepanel.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("REMOVE " + Global.item, null, Deletepanel, null);
		Deletepanel.setLayout(null);
		
		JLabel lblDeleteResult = new JLabel("");
		lblDeleteResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteResult.setForeground(Color.BLUE);
		lblDeleteResult.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblDeleteResult.setBounds(229, 332, 127, 23);
		Deletepanel.add(lblDeleteResult);
		
		
		JLabel lblItemId_1 = new JLabel("Item ID");
		lblItemId_1.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblItemId_1.setBounds(194, 152, 87, 23);
		Deletepanel.add(lblItemId_1);
		
		txtItemID = new JTextField();
		txtItemID.setColumns(10);
		txtItemID.setBounds(317, 155, 109, 20);
		Deletepanel.add(txtItemID);
		
		JLabel label_5 = new JLabel("INVENTORY");
		label_5.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label_5.setBounds(225, 49, 159, 23);
		Deletepanel.add(label_5);
		
		JButton btnDelete = new JButton("REMOVE IT");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int id=Integer.parseInt(txtItemID.getText());
				 
				if(id > 0) {	 
					 tree.delete(id);
					  
						 lblDeleteResult.setForeground(Color.GREEN);
						 lblDeleteResult.setText( "Deleted");
				}
			}
		});
		btnDelete.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnDelete.setBounds(225, 226, 128, 23);
		Deletepanel.add(btnDelete);
		
		JLabel label = new JLabel("BST");
		label.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label.setBounds(10, 11, 109, 23);
		Deletepanel.add(label);
		
		
		JPanel Showpanel = new JPanel();
		Showpanel.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("SHOW " + Global.item, null, Showpanel, null);
		Showpanel.setLayout(null);
		
		
		JList<String> jlist = new JList<String>();
		//jlist.setBounds(76, 99, 395, 166);
		//Showpanel.add(jlist);
		
		JScrollPane jpane = new JScrollPane(jlist);
		jpane.setBounds(106, 99, 395, 166);
		Showpanel.add(jpane);
		
		
		JLabel lblCount = new JLabel("");
		lblCount.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblCount.setBounds(430, 74, 46, 14);
		Showpanel.add(lblCount);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tree.inorder();			
				listModel.removeAllElements();
				 
				ArrayList<String> arlist = tree.printAll();
				for (int i = 0; i < arlist.size(); i++)
				{
				    listModel.addElement(arlist.get(i));
				}
				jlist.setModel(listModel);
				jlist.ensureIndexIsVisible(arlist.size());
				
			
				
			}
		});
		btnShow.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnShow.setBounds(260, 65, 107, 23);
		Showpanel.add(btnShow);
		
		JLabel label_8 = new JLabel("INVENTORY");
		label_8.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label_8.setBounds(218, 25, 151, 23);
		Showpanel.add(label_8);
		
		JLabel lblFile = new JLabel("");
		lblFile.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblFile.setBounds(106, 335, 395, 51);
		Showpanel.add(lblFile);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tree.saveAll();
				lblFile.setText("SAVED TO FILE");
			}
		});
		btnNewButton.setBounds(110, 295, 89, 23);
		Showpanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("READ");
		btnNewButton_1.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = tree.readAll();
				lblFile.setText("READ FROM FILE" + "\n" + r);
			}
		});
		btnNewButton_1.setBounds(412, 295, 89, 23);
		Showpanel.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("BST");
		label_4.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label_4.setBounds(10, 11, 109, 23);
		Showpanel.add(label_4);
			
			JPanel IteratorPanel = new JPanel();
			IteratorPanel.setLayout(null);
			IteratorPanel.setBackground(new Color(240, 255, 255));
			tabbedPane.addTab("ITERATOR", null, IteratorPanel, null);
			
			JLabel label_9 = new JLabel("INVENTORY ");
			label_9.setFont(new Font("Dialog", Font.BOLD, 18));
			label_9.setBounds(215, 47, 227, 23);
			IteratorPanel.add(label_9);
			
			JLabel label_13 = new JLabel("");
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setForeground(Color.BLUE);
			label_13.setFont(new Font("Dialog", Font.PLAIN, 15));
			label_13.setBounds(221, 343, 176, 23);
			IteratorPanel.add(label_13);
			
			JLabel lblOccurs = new JLabel("");
			lblOccurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblOccurs.setBounds(229, 230, 109, 23);
			IteratorPanel.add(lblOccurs);
			
			JButton btnOccur = new JButton("Occur");
			btnOccur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Item[] itlist = tree.getItems();
					ItemCollection itco = new ItemCollection(itlist);
					String nm=  txtNameOccur.getText();
					
					try {
					boolean rt = iterate(itco, nm);
					if(rt) {
						lblOccurs.setText("FOUND");
						lblOccurs.setForeground(Color.GREEN);
					}
					else {
						lblOccurs.setText("NOT FOUND");
						lblOccurs.setForeground(Color.RED);
					}
					}
					catch(Exception es) {
						lblOccurs.setText("NOT FOUND");
						lblOccurs.setForeground(Color.RED);
					}
					
				}

				private boolean iterate(ItemCollection itco, String nm) {
					boolean res=false;
					 Iterator value = itco.iterator();
				        while(value.hasNext()){
				           Item  item=(Item)value.next();
				            if (item.getName().equals(nm))return true;}    
			        return  res;
					
				}
			});
			btnOccur.setFont(new Font("Sprocket BT", Font.BOLD, 15));
			btnOccur.setBounds(233, 174, 109, 23);
			IteratorPanel.add(btnOccur);
			
			txtNameOccur = new JTextField();
			txtNameOccur.setColumns(10);
			txtNameOccur.setBounds(310, 117, 109, 20);
			IteratorPanel.add(txtNameOccur);
			
			JLabel label_15 = new JLabel("BST");
			label_15.setFont(new Font("Dialog", Font.BOLD, 18));
			label_15.setBounds(10, 11, 109, 23);
			IteratorPanel.add(label_15);
			
			JLabel label_10 = new JLabel("Item Name");
			label_10.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			label_10.setBounds(189, 120, 87, 23);
			IteratorPanel.add(label_10);
		
		
	}
}
