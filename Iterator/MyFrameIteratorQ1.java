
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameIteratorQ1 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Iterator   Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Sum");private JTextField t2=new JTextField("0",15);
	private JButton b2=new JButton("Max");private JTextField t3=new JTextField("0",15);
	private JPanel p1=new JPanel();
	
    int[] arr = { 5, 3, 9, 3, 8, 7 , 5, 1 };
    Octo m = new Octo(arr);
	

	public     static int sum(Octo o){              // to be completed
		int res=0;
        Iterator value = o.iterator();
       while(value.hasNext()){
           res+=(Integer)value.next();}    
        return  res;
 	   }
	
	public     static int max(Octo o){              // to be completed
		int res=0;
   
		int val;
		
		 Iterator value = o.iterator();
	       while(value.hasNext()){
	    	   val = (Integer)value.next();
	    	   
	    	   if(res<val) {
	    		   res = val;
	    	   }
	       }    
	       
	        return  res;
	      
 	   }
	
	public MyFrameIteratorQ1(String s){
		super(s);
		java.awt.Container content=getContentPane();
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
    	
    	t1.setText(m.printList());
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	          		int v1=this.sum(m);
	          		t2.setText(""+v1);}
	            
	
 	if (target==b2){ 
  		int v1=this.max(m);
  		t3.setText(""+v1);}
     }
	 }

