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


public class HashTableInven {

	private static HashTableInven single;
	private static boolean created=  false;
	
	private HashTableInven()
	{
		single = this;
		created = true;
		initialize();
	}
	
	public static HashTableInven getInstance() {
		// TODO Auto-generated method stub
		if(!created) {
			single=new HashTableInven();
		}
		return single;
	}
	
	JFrame frame;
	private JTextField txtName;
	private JTextField txtType;
	private JTextField txtPrice;


	HashTable table=new HashTable();
	
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JTextField txtSearchID;
	private JTextField txtID;
	private JTextField txtDelID;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HashTableInven window = new HashTableInven();
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
		
		JPanel Deletepanel = new JPanel();
		Deletepanel.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("DELETE " + Global.item, null, Deletepanel, null);
		tabbedPane.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		Deletepanel.setLayout(null);
		
		JLabel label_4 = new JLabel("HashTable");
		label_4.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label_4.setBounds(10, 11, 109, 23);
		Deletepanel.add(label_4);
		
		JLabel label_5 = new JLabel("INVENTORY");
		label_5.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label_5.setBounds(202, 62, 109, 23);
		Deletepanel.add(label_5);
		
		JLabel label_6 = new JLabel("Item ID");
		label_6.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		label_6.setBounds(120, 135, 87, 23);
		Deletepanel.add(label_6);
		
		txtDelID = new JTextField();
		txtDelID.setColumns(10);
		txtDelID.setBounds(261, 138, 109, 20);
		Deletepanel.add(txtDelID);
		
		
		JLabel lblDeleteResult = new JLabel("");
		lblDeleteResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteResult.setForeground(Color.BLUE);
		lblDeleteResult.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		lblDeleteResult.setBounds(127, 263, 176, 23);
		Deletepanel.add(lblDeleteResult);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int id = Integer.parseInt(txtDelID.getText());
				if(table.delete(id)) {
					lblDeleteResult.setText("Deleted");
					lblDeleteResult.setForeground(Color.GREEN);
				}
				else {
					lblDeleteResult.setText("Not Found");
					lblDeleteResult.setForeground(Color.RED);
				}
			}
		});
		btnDelete.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
		btnDelete.setBounds(172, 197, 109, 23);
		Deletepanel.add(btnDelete);
		
		
		JLabel label = new JLabel("INVENTORY");
		label.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		label.setBounds(245, 48, 109, 23);
		Addpanel.add(label);
		
		
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
 	 		   
 	 		         table.insert(id, it);
 	 		          
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
		
		JLabel lblHashtable = new JLabel("HashTable");
		lblHashtable.setFont(new Font("Sprocket BT", Font.BOLD, 18));
		lblHashtable.setBounds(10, 11, 109, 23);
		Addpanel.add(lblHashtable);
		
			
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
			txtNameArea.setBounds(155, 272, 267, 119);
			Searchpanel.add(txtNameArea);
			
			
			JButton btnSearch = new JButton("SEARCH");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					int id  = Integer.parseInt(txtSearchID.getText());
					try {
					if(id > 0) {
						HNode result = table.search(id);
						txtNameArea.setVisible(true);
						txtNameArea.setText(result.item.toString());
						txtNameArea.append(System.getProperty("line.separator"));
						txtNameArea.append("Step Count : "  + table.getCount() );
					}
					}catch(Exception er) {	
						txtNameArea.setVisible(true);
						txtNameArea.setText("NOT FOUND");
					}
				}
			});
			
			btnSearch.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			btnSearch.setBounds(228, 168, 109, 23);
			Searchpanel.add(btnSearch);
			
			JLabel label_7 = new JLabel("INVENTORY");
			label_7.setFont(new Font("Sprocket BT", Font.BOLD, 18));
			label_7.setBounds(267, 33, 109, 23);
			Searchpanel.add(label_7);
			
			JLabel label_9 = new JLabel("HashTable");
			label_9.setFont(new Font("Sprocket BT", Font.BOLD, 18));
			label_9.setBounds(10, 11, 109, 23);
			Searchpanel.add(label_9);
			
			JButton btnIterate = new JButton("ITERATE HASH TABLE");
			btnIterate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					HNode hn = new HNode();
					StringBuffer bfr = new StringBuffer();
					Iterator iter = hn.iterator();
					while(iter.hasNext()) {
						HNode node = (HNode) iter.next();
						bfr.append(node.key + "->" + node.item.toString());
						bfr.append(System.getProperty("line.separator"));
					}
					txtNameArea.setVisible(true);
					txtNameArea.setText(bfr.toString());
				}
			});
			btnIterate.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			btnIterate.setBounds(190, 224, 186, 23);
			Searchpanel.add(btnIterate);
			
			
			JPanel Showpanel = new JPanel();
			Showpanel.setBackground(new Color(240, 255, 255));
			tabbedPane.addTab("ITERATOR LIST", null, Showpanel, null);
			Showpanel.setLayout(null);
			
			
			JLabel lblCount = new JLabel("");
			lblCount.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			lblCount.setBounds(430, 74, 46, 14);
			Showpanel.add(lblCount);
			
			JTextArea txtItemType = new JTextArea();
			txtItemType.setText("Item1:type1:10:10,\r\nItem2:type2:20:20,\r\nItem3:type3:30:30,\r\nItem4:type:40:40,\r\nItem5:type:50:50");
			txtItemType.setBounds(137, 120, 344, 109);
			Showpanel.add(txtItemType);
			

			JLabel lbIterators = new JLabel("");
			lbIterators.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			lbIterators.setBounds(137, 306, 339, 124);
			Showpanel.add(lbIterators);
			
			JButton btnShow = new JButton("Add to collection \r\n& Run Iterator");
			btnShow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
			
				String coll = txtItemType.getText();
				String[] items = coll.split(",");			
				Item[] itemcol=new Item[items.length];
				
				for(int i=0; i<items.length; i++) {
						String[] sin = items[i].split(":");
						String name = sin[0];
						String type = sin[1];
						int euro = Integer.parseInt(sin[2]); 
						int cents= Integer.parseInt(sin[3]);
						Item it = new Item(name, type,euro,  cents);
						itemcol[i] = it;
					}
				
				ItemCollection icol = new ItemCollection(itemcol);
				lbIterators.setText(iterate(icol));
				}

				private String iterate(ItemCollection icol) {
					// TODO Auto-generated method stub
					StringBuilder sb = new StringBuilder();
			        Iterator value = icol.iterator();
			       while(value.hasNext()){
			            sb.append(System.getProperty("line.separator"));
			    	   sb.append(value.next());
			        }    
			        return  sb.toString();
			        
				}
			});
			btnShow.setFont(new Font("Sprocket BT", Font.PLAIN, 15));
			btnShow.setBounds(184, 240, 247, 27);
			Showpanel.add(btnShow);
			
			JLabel label_8 = new JLabel("INVENTORY");
			label_8.setFont(new Font("Sprocket BT", Font.BOLD, 18));
			label_8.setBounds(260, 25, 109, 23);
			Showpanel.add(label_8);
			
			
			
			
			JLabel lblNewLabel = new JLabel("Item Name : Item Type : Item Euro : Item Cents,\r\n\r\n\r\n");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(149, 91, 327, 14);
			Showpanel.add(lblNewLabel);
			
			JLabel lblItemDetailsSeperated = new JLabel("Write Item Details seperated by commas");
			lblItemDetailsSeperated.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblItemDetailsSeperated.setBounds(184, 66, 327, 14);
			Showpanel.add(lblItemDetailsSeperated);
			
			
			
			
			txtNameArea.setVisible(false);
		
		
	}
}
