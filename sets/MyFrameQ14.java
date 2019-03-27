
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.*;


class MyFrameQ14 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  HashSet  Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Add Element");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("   Max");private JTextField t3=new JTextField("0",15);
	private JButton b3=new JButton("Seach - Enter Target:");private JTextField t4=new JTextField("2",15);
	private JButton b4=new JButton("Count Even:");private JTextField t5=new JTextField("",15);
	private JButton b5=new JButton("Sum:");private JTextField t6=new JTextField("",15);
	
	
	private JPanel p1=new JPanel();
	HashSet<Integer> list = new HashSet<Integer>();



	static boolean search(HashSet set, Integer i1) {
		boolean res = false;
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
			int element = (Integer) i.next();
			if(element == i1)res = true; 
		}
		
		return res;

	}

	static String print(HashSet set) {
		StringBuffer res=new StringBuffer("{ ");
		Iterator i = set.iterator();

		if (i.hasNext())
			res.append("" + i.next());
		while (i.hasNext()) {
			int element = (Integer) i.next();
			res.append("," + element);
		}
		res.append("}");
		return res.toString();
	}
	
	static int sum(HashSet set) {
		int res = 0;

		Iterator i = set.iterator();
		while (i.hasNext()) {
			int element = (Integer) i.next();
			 res+= element; 
		}
		
		return res;
	}
	static int countEven(HashSet set) {
		int res = 0;

		Iterator i = set.iterator();
		while (i.hasNext()) {
			int element = (Integer) i.next();
			if(element%2==0)res++; 
		}
		
		return res;
	} 
	static int max(HashSet set) {
		int res = 0;
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
			int element = (Integer) i.next();
			if(element > res)res = element; 
		}
		
		return res;
	}  
	public MyFrameQ14(String s){
		super(s);
		Container content=getContentPane();
		Collections.addAll(list , 4,5,3,2,3,1,3);
        displayList(list);
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);
		p1.add(b3); p1.add(t4);
		p1.add(b4); p1.add(t5);
		p1.add(b5); p1.add(t6);
		content.add(p1);
		b1.addActionListener(this);  b2.addActionListener(this);   b3.addActionListener(this);  
		b4.addActionListener(this);  b5.addActionListener(this); 
		setSize(390,400);    setVisible(true);}
	
	
    public void displayList(HashSet<Integer> list){
    	
    	t1.setText(print(list));
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	          		int v1=Integer.parseInt(t2.getText());
	             	list.add(v1);
	             	displayList(list);}
	            
	
 	if (target==b2){ 
  		int res = max(list);
  		t3.setText(""+res);
     	}
 	if (target==b3){ 
 		int t=Integer.parseInt(t4.getText());
  		boolean res = search(list,t);
  		t4.setText("Found = "+res);
     	}
 	if (target==b4){ 
 		int  res = countEven(list);
  		t5.setText(""+res);
     	}
 	if (target==b5){ 
 		int  res = sum(list);
  		t6.setText(""+res);
     	}
     }
	 }

