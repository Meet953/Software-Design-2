
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

class MyFrameQ11 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Recursion  Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Add Element");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("  All Even");private JTextField t3=new JTextField("0",15);
	private JPanel p1=new JPanel();
	ArrayList<Integer> list = new ArrayList<Integer>();

	public     static boolean allEven(ArrayList list){              // to be completed


	    if (list.size()==0) return true;
		   else{     int first= (Integer)list.get(0);
		                list.remove(0);
		                if (first%2 != 0) return false;
	                   else          return  allEven(list );

	 	   
	 	   }
	    
 	   
 	   }

	
	public MyFrameQ11(String s){
		super(s);
		Container content=getContentPane();
		Collections.addAll(list , 4,2,6,2,8,6,2);
        displayList();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(3,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);
		content.add(p1);
		b1.addActionListener(this);  b2.addActionListener(this);   
		setSize(390,200);    setVisible(true);}
	
	
    public void displayList(){
    	StringBuffer str=new StringBuffer("[ ");
    	if (list.isEmpty()==false)str.append(list.get(0));
    	for(int i=1; i<list.size(); i++){
    		str.append(" ,"+list.get(i));
    	}
    	str.append("]");
    	t1.setText(str.toString());
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	          		int v1=Integer.parseInt(t2.getText());
	             	list.add(v1);
	             	displayList();}
	            
	
 	if (target==b2){ 
  		boolean res = allEven(new ArrayList(list));
  		t3.setText(""+res);
     	}
     }
	 }

