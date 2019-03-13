package bookfactory;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;




class MyFrameFactoryQ2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Iterator  Application  ");
	private JLabel l1 = new JLabel(" Title");
	private JLabel l2 = new JLabel(" ISBN");
	private JLabel l3 = new JLabel(" Price (€)");
	private JLabel l4 = new JLabel(" Weight (g)");
	private JTextField t1=new JTextField("Java Basics",15);private JTextField t2=new JTextField("B123423",15);private JTextField t3=new JTextField("56",15);
	private JTextField t4=new JTextField("330",15);
	
	private JButton b1=new JButton("Create New Book");
	private JButton b2=new JButton("Clear Details");
	private JButton b3=new JButton("Calc Gross Price");private JTextField t5=new JTextField("0",15);
	
	
	private JPanel p1=new JPanel();
	BookFactory cfactory = new BookFactory();
	Book b;
	


	
	public MyFrameFactoryQ2(String s){
		super(s);
		java.awt.Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  l1.setFont(f);l2.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(l4); p1.add(t4);
		p1.add(b1); p1.add(b2);
		p1.add(b3); p1.add(t5);	
		content.add(p1);
		b = cfactory.getBook("Java Basics","B123423",56,330);
		b1.addActionListener(this);  b2.addActionListener(this);    b3.addActionListener(this); 
		setSize(410,260);    setVisible(true);}
	
	

	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){ String title=t1.getText();
	 	                 String isbn=t2.getText();
	 	                 double p=Double.parseDouble(t3.getText());
	 	                 int w=Integer.parseInt(t4.getText());	
	 	        		 b = cfactory.getBook(title,   isbn,p,w);
	 		
	 	}

	            
	
 	     if (target==b2){  t1.setText("");   t2.setText("");  t3.setText("");     t4.setText("");      }
 	     if (target==b3){ t5.setText(""+b.readNetPrice());}
     }
	 }

