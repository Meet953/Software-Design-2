 

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

class MyFrameQ8 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Recursion  Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Add Element");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("Count Target");private JTextField t3=new JTextField("0",15);
	private JPanel p1=new JPanel();
	
	private JLabel l2 = new JLabel("       Enter Target here");
	private JTextField t4=new JTextField("0",15);
	ArrayList<Integer> list = new ArrayList<Integer>();

	public     static int countTarget(ArrayList list,int tar){              // to be completed
		if (list.size()==0) return 0;
	 	   else {
	 		   int first = (Integer)list.get(0);
	 		  list.remove(0);
	 		   if(first==tar)  return 1 + countTarget(list, tar);
	 		   else  return 0 + countTarget(list, tar);
	 	   }
 	   
 	   }

	
	public MyFrameQ8(String s){
		super(s);
		Container content=getContentPane();
		Collections.addAll(list , 4,5,3,2,3,1,3);
        displayList();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t2);
		p1.add(l2); p1.add(t4);
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
 		int t=Integer.parseInt(t4.getText());
  		int res = countTarget(new ArrayList(list),t);
  		t3.setText(""+res);
     	}
     }
	 }

