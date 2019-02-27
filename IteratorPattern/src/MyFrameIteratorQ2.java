
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameIteratorQ2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Iterator  Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1=new JTextField("0",15);
	private JButton b1=new JButton("Count Occurs (Enter Letter)");private JTextField t2=new JTextField("w",15);
	private JButton b2=new JButton("Search Letter (Enter Letter)");private JTextField t3=new JTextField("w",15);
	private JLabel l2 = new JLabel("Method Result");private JTextField t4=new JTextField("0",15);
	private JButton b3=new JButton("Update String");private JTextField t5=new JTextField("0",15);
	
	
	private JPanel p1=new JPanel();
	
    Word m = new Word("worldwide");
	

	public     static int countOccurs(Word o,char c){              // to be completed
		int res=0;
       Iterator value = o.iterator();
        while(value.hasNext()){
           char temp=(Character)value.next();
            if (temp==c)res++;}    
        return  res;
 	   }
	
	public     static boolean containsLetter(Word o,char c){              // to be completed
		 
		 Iterator value = o.iterator();
	        while(value.hasNext()){
	           char temp=(Character)value.next();
	            if (temp==c) {
	            System.out.println(c + "");
	            return  true;
	            }
	        }    
        return  false;
 	   }
	
	public MyFrameIteratorQ2(String s){
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
    	
    	t1.setText(m.readWord());
    }
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ 
	 		        char t=t2.getText().charAt(0);
	          		int v1=this.countOccurs(m,t);
	          		t4.setText(""+v1);}
	            
	
 	     if (target==b2){ 
		        char t=t3.getText().charAt(0);
          		boolean v1=this.containsLetter(m,t);
          		t4.setText(""+v1);}
 	     if (target==b3){ 
  	            	m.update(t5.getText());
  		            displayList();}
     }
	 }

