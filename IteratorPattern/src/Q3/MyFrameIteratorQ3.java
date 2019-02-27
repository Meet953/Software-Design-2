package Q3;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameIteratorQ3 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Iterator   Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("countEven");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("addOdd");private JTextField t3=new JTextField("0",15);
	private JButton b3=new JButton("updateNum");private JTextField t4=new JTextField("0",15);
	private JPanel p1=new JPanel();
	
    Number1 m = new Number1(12345123);
	

	public     static int countEven(Number1 o){              // to be completed
		int res=0;
        Iterator value = o.iterator();
        while(value.hasNext()){
            int temp =(Integer)value.next();
           if (temp%2==0)res++;}    
        return  res;
 	   }
	
	public     static int addOdd(Number1 o){              // to be completed
		int res=0;
        Iterator value = o.iterator();
        while(value.hasNext()){
            int temp =(Integer)value.next();
           if (temp%2!=0)res++;}    
        return  res;
 	   }
	
	public MyFrameIteratorQ3(String s){
		super(s);
		java.awt.Container content=getContentPane();
        displayList();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t2);
		p1.add(b2); p1.add(t3);
		p1.add(b3); p1.add(t4);
		content.add(p1);
		b1.addActionListener(this);  b2.addActionListener(this);   b3.addActionListener(this);  
		setSize(390,200);    setVisible(true);}
	
	
    public void displayList(){
    	
    	t1.setText(m.convertToString());
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	          		int v1=this.countEven(m);
	          		t2.setText(""+v1);
	          		}
	            
	
     	if (target==b2){ 
  		           int v1=this.addOdd(m);
  		           t3.setText(""+v1);}
     	
     	if (target==b3){ 
	           m.update(Integer.parseInt(t4.getText()));;
	           displayList();
	           }
     }
	 }

