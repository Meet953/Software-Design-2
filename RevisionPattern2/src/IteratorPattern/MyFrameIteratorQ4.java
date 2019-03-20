package IteratorPattern;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameIteratorQ4 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Iterator  Application  ");
	private JLabel l1 = new JLabel("             Sentence");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Count Occurs (Enter Word)");private JTextField t2=new JTextField("the",15);
	private JButton b2=new JButton("Search Letter (Enter Word)");private JTextField t3=new JTextField("the",15);
	private JLabel l2 = new JLabel("Method Result");private JTextField t4=new JTextField("0",15);
	private JButton b3=new JButton("Update String");private JTextField t5=new JTextField("0",15);
	
	
	private JPanel p1=new JPanel();
	
    Sentence m = new Sentence("the sun and moon are in the sky");
	

	public     static int countOccurs(Sentence o,String s){              // to be completed
		int res=0;
        Iterator value = o.iterator();
        while(value.hasNext()){
            String  temp=(String)value.next();
            if (temp.equals(s))res++;}    
        return  res;
 	   }
	
	public     static boolean containsWord(Sentence o,String s){              // to be completed
		boolean res=false;
		 Iterator value = o.iterator();
	        while(value.hasNext()){
	            String  temp=(String)value.next();
	            if (temp.equals(s))return true;}    
        return  res;
 	   }
	
	public MyFrameIteratorQ4(String s){
		super(s);
		java.awt.Container content=getContentPane();
        displayList();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  l1.setFont(f);l2.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);
		p1.add(l2); p1.add(t4);
		p1.add(b3); p1.add(t5);	
		content.add(p1);
		b1.addActionListener(this);  b2.addActionListener(this);    b3.addActionListener(this); 
		setSize(410,260);    setVisible(true);}
	
	
    public void displayList(){
    	
    	t1.setText(m.readSentence());
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	 		        String t=t2.getText();
	          		int v1=this.countOccurs(m,t);
	          		t4.setText(""+v1);}
	            
	
 	     if (target==b2){ 
		        String t=t3.getText();
          		boolean v1=this.containsWord(m,t);
          		t4.setText(""+v1);}
 	     if (target==b3){ 
  	            	m.update(t5.getText());
  		            displayList();}
     }
	 }

