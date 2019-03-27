package Recursions;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameRecursionQ3 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Recurstion   Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JLabel l2 = new JLabel(" Enter Target");
	private JTextField t4=new JTextField("0",15);
	private JButton b1=new JButton("  countTarget");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("max");private JTextField t3=new JTextField("0",15);
	private JPanel p1=new JPanel();
	
    ArrayList<Integer> arr = new ArrayList();


	

	public     static int countTarget(ArrayList li,int tar){              // to be completed
		if(li.size() == 0) return 0;
		int first = (int) li.get(0);
		li.remove(0);
		if(first == tar) {
			return 1 + countTarget(li, tar);
		}else {
			return 0 + countTarget(li, tar);
		}
 	   }
	
	public     static int max(ArrayList li, int m){    
		 
		if(li.size() == 0) return m;
		 
		int first = (int) li.get(0);
		li.remove(0);
		if(first > m) {
			 
			return  max(li, first);
		}else {
			return  max(li, m);
		}
 	   }
	
	
	
	public     static int max2(ArrayList li){    
		 
		if(li.size() == 0) return 0;
		 
		int first = (int) li.get(0);
		li.remove(0);
		if(first > max2(new ArrayList(li))) {
			 
			return  first;
		}else {
			return  max2(li);
		}
 	   }
	
	
	public MyFrameRecursionQ3(String s){
		super(s);
		Collections.addAll(arr , 5, 3, 5, 3, 8, 9 , 5, 1,8);
		java.awt.Container content=getContentPane();
        displayList();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  l1.setFont(f);l2.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t4);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);
		content.add(p1);
		b1.addActionListener(this);  b2.addActionListener(this);   
		setSize(390,200);    setVisible(true);}
	
	
	
    public void displayList(){
    	String res="["+(Integer)arr.get(0);
        for(int i=1;i<arr.size();i++){ res+=", "+(Integer)arr.get(i);}
    	t1.setText(res+"]");
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	          		
	          		int t=Integer.parseInt(t4.getText());
	          		int v1=this.countTarget(new ArrayList(arr),t);
	          		t2.setText(""+v1);}
	            
	
 	if (target==b2){ 
  		//int v1=this.max(new ArrayList(arr), 0);
  		int v1=this.max2(new ArrayList(arr));
  		t3.setText(""+v1);
  		}
     }
	 }


